package com.example.a26144859.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalcPesoPlaneta extends AppCompatActivity {

    private EditText pesonaTerra;
    private Spinner spPlaneta;
    private Button btnCalcularPeso;
    private TextView resultPesPlaneta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_peso_planeta);

        pesonaTerra = findViewById(R.id.p_naterra);
        spPlaneta = findViewById(R.id.sp_planeta);
        btnCalcularPeso = findViewById(R.id.btn_calcularpeso);
        resultPesPlaneta = findViewById(R.id.res_pesoplaneta);

        btnCalcularPeso.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                String opEscolhida = spPlaneta.getSelectedItem().toString();
                double peso = Double.parseDouble(pesonaTerra.getText().toString());
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
                String texto = "O seu peso no planeta: " + opEscolhida + "é de: " + vlPeso;
                resultPesPlaneta.setText(texto);
            }
        });
    }
}
