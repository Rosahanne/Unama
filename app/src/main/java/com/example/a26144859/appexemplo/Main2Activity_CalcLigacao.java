package com.example.a26144859.appexemplo;

import android.app.Activity;
import android.support.design.widget.TextInputEditText;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity_CalcLigacao extends AppCompatActivity {

    private Spinner spOperadora;
    private TextView tempoLigacao;
    private TextView valorTotal;
    private Button btn_calcularLigacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__calc_ligacao);

        spOperadora = findViewById(R.id.spinner_op);
        tempoLigacao = findViewById(R.id.tempLigacao);
        valorTotal = findViewById(R.id.txt_valorTotal);
        btn_calcularLigacao = findViewById(R.id.btn_CalcLig);

        btn_calcularLigacao.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                String opEscolhida = spOperadora.getSelectedItem().toString();
                double tpLigacao = Double.parseDouble(tempoLigacao.getText().toString());
                double vlTotal=0;

                switch (opEscolhida) {

                        case "tim":
                            vlTotal = tpLigacao * 1.20 - 0.10;
                            break;

                        case "claro":
                            vlTotal = tpLigacao * 1.50 - 0.095;
                            break;

                        case "vivo":
                            vlTotal = tpLigacao * 1.14 - 0.125;
                            break;
                    }
                String texto = "Valor a pagar é: " + vlTotal;
                valorTotal.setText(texto);
            }
        });
    }
}

