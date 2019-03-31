package com.example.a26144859.appexemplo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GastoViagem2 extends AppCompatActivity {

    private TextView texto;
    private Button compartilhar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_viagem2);

        texto = findViewById(R.id.txtGastoViagem2);
        compartilhar = findViewById(R.id.btn_compartilhar);

        Bundle dados = getIntent().getExtras();
        String modelo = dados.getString("modeloAuto");
        String distancia = dados.getString("distanciaKm");
        String potencia = dados.getString("potenciaMot");
        String litrovalor = dados.getString("litroGaso");
        String result = dados.getString("Resultado");
        texto.setText(modelo + " " + potencia + " gasta " + result + " ao percorrer a distância de: " + distancia+ " Km " + "ao valor de: " + litrovalor + " de combustível");

        compartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle dados = getIntent().getExtras();

                Intent intent = new Intent( Intent.ACTION_SEND );
                intent.setType("text/plain" );
                intent.putExtra(Intent.EXTRA_SUBJECT, "Resultado" );
                intent.putExtra(Intent.EXTRA_TEXT,dados.getString("modeloAuto") + " " + dados.getString("potenciaMot") + " gasta " + dados.getString("Resultado") + " ao percorrer a distância de: " + dados.getString("distanciaKm")+ " Km " + "ao valor de: " + dados.getString("litroGaso") + " de combustível");

                startActivity(Intent.createChooser(intent,
                        "Compartilhar..."));

            }
        });



    }
}




