package com.example.a26144859.appexemplo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

public class GastoViagem extends AppCompatActivity {

    private TextInputEditText modeloAuto;
    private TextInputEditText distanciaKm;
    private TextInputEditText potenciaMot;
    private TextInputEditText litroGasol;
    private double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_viagem);

        modeloAuto = findViewById(R.id.ip_ModAuto);
        distanciaKm = findViewById(R.id.ip_DistKm);
        potenciaMot = findViewById(R.id.ip_PotMotor);
        litroGasol = findViewById(R.id.ip_LitGasolina);


        public void AcaoBotao(View acao){
            double distancia = Double.parseDouble(distanciaKm.getText().toString());
            double pontecia = Double.parseDouble(potenciaMot.getText().toString());
            double litroValor = Double.parseDouble(litroGasol.getText().toString());
            double calculo;

            if (pontecia <= 1.0) {
                calculo = 13;
            } else if (pontecia > 1.0 && pontecia < 1.4) {
                calculo = 11;
            } else if (pontecia > 1.4 && pontecia < 1.9) {
                calculo = 9.5;
            } else {
                calculo = 7.75;
            }

            resultado = (calculo / distancia) * litroValor;
            System.out.println(resultado);
            System.out.println(distancia);
            System.out.println(litroValor);
            DecimalFormat d = new DecimalFormat("00.00");
            String res = d.format(resultado);


            Intent intent = new Intent(this, GastoViagem2.class);
            i.putExtra("modeloAuto", modeloAuto.getText().toString());
            i.putExtra("potenciaMot", potenciaMot.getText().toString());
            i.putExtra("distanciaKm", distanciaKm.getText().toString());
            i.putExtra("litroGaso", litroGasol.getText().toString());
            i.putExtra("Resultado", res);
            System.out.println(res);
            startActivity(intent);
        }
    }
}