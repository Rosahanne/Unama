package com.example.a26144859.appexemplo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.DecimalFormat;

public class GastoViagem extends AppCompatActivity {

    private TextInputEditText modeloAuto;
    private TextInputEditText distanciaKm;
    private TextInputEditText potenciaMot;
    private TextInputEditText litroGasol;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_viagem);

        modeloAuto = findViewById(R.id.ip_ModAuto);
        distanciaKm = findViewById(R.id.ip_DistKm);
        potenciaMot = findViewById(R.id.ip_PotMotor);
        litroGasol = findViewById(R.id.ip_LitGasolina);
        calcular = findViewById(R.id.button_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double distancia = Double.parseDouble(distanciaKm.getText().toString());
                double potencia = Double.parseDouble(potenciaMot.getText().toString());
                double litroValor = Double.parseDouble(litroGasol.getText().toString());
                double calcPot;

                if (potencia <= 1.0) {
                    calcPot = 13;
                } else if (potencia > 1.0 && potencia < 1.4) {
                    calcPot = 11;
                } else if (potencia > 1.4 && potencia < 1.9) {
                    calcPot = 9.5;
                } else {
                    calcPot = 7.75;
                }

                double resultado = (calcPot / distancia) * litroValor;
                DecimalFormat d = new DecimalFormat("00.00");
                String res = d.format(resultado);

                Intent intent = new Intent(GastoViagem.this,GastoViagem2.class);
                intent.putExtra("Modelo Auto", modeloAuto.getText().toString());
                intent.putExtra("Potência do Motor", potenciaMot.getText().toString());
                intent.putExtra("Distância em Km", distanciaKm.getText().toString());
                intent.putExtra("Litro de Gasolina", litroGasol.getText().toString());
                intent.putExtra("Resultado", res);
                System.out.println(res);
                startActivity(intent);

            }
        });


    }
}