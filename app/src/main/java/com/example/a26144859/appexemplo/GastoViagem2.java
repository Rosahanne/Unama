package com.example.a26144859.appexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GastoViagem2 extends AppCompatActivity {

    private TextView texto;
    private Button btcompartilhar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_viagem2);

        texto = findViewById(R.id.txtGastoViagem2);
        btcompartilhar = findViewById(R.id.btn_compartilhar);

        Bundle dados = getIntent().getExtras();
        String modelo = dados.getString("modeloAuto");
        String distancia = dados.getString("distanciaKm");
        String potencia = dados.getString("potenciaMot");
        String litrovalor = dados.getString("litroGaso");
        String result = dados.getString("Resultado");
        texto.setText(modelo+ " " + potencia + " gasta " + result + " ao percorrer a distância de: " +distancia+ " Km " + litrovalor + "Valor");

        btcompartilhar setOnClick

    }
}




