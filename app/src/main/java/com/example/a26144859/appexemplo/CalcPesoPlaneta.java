package com.example.a26144859.appexemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalcPesoPlaneta extends AppCompatActivity {

    private EditText pesoNaTerra;
    private Spinner sp_planeta;
    private Button btn_calcPeso;
    private TextView resultadoCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_peso_planeta);

        pesoNaTerra = findViewById(R.id.p_naTerra);
        sp_planeta = findViewById((R.id.spinner_planet));
        btn_calcPeso = findViewById(R.id.calculoPeso);
        resultadoCalculo = findViewById(R.id.resultPeso);


        btn_calcPeso.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                String opEscolhida = sp_planeta.getSelectedItem().toString();
                double peso = Double.parseDouble(pesoNaTerra.getText().toString());
                double vlPeso=0;

                switch (opEscolhida) {

                    case "Mercúrio":
                        vlPeso = peso/10 * 0.37;
                        break;

                    case "Vênus":
                        vlPeso = peso/10 * 0.88;
                        break;

                    case "Marte":
                        vlPeso = peso/10 * 0.38;
                        break;

                    case "Júpiter":
                        vlPeso = peso/10 * 2.64;
                        break;

                    case "Saturno":
                        vlPeso = peso/10 * 1.15;
                        break;

                    case "Urano":
                        vlPeso = peso/10 * 1.17;
                        break;
                }
                String texto = "O seu peso nesse planeta é de: " + vlPeso;
                resultadoCalculo.setText(texto);
            }
        });
    }


}

