package com.example.a26144859.appexemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcCatNatacao extends AppCompatActivity {

    private EditText idadeNadador;
    private Button btn_calcCategoria;
    private TextView categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_cat_natacao);

        idadeNadador = findViewById(R.id.ip_idade);
        btn_calcCategoria = findViewById(R.id.b_calcCategoria);
        categoria = findViewById(R.id.txt_cat);

        btn_calcCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double idade = Double.parseDouble(idadeNadador.getText().toString());
                double resutado;

                if (idade >= 5 && idade <= 7) {
                    String resultado = "O nadador está na categoria: INFANTIL A";
                    categoria.setText(resultado);
                }else if (idade >= 8 && idade <= 10){
                    String resultado = "O nadador está na categoria: INFANTIL B";
                    categoria.setText(resultado);
                }else if (idade >= 11 && idade <= 13){
                    String resultado = "O nadador está na categoria: JUVENIL A";
                    categoria.setText(resultado);
                }else if (idade >= 14 && idade <= 17){
                    String resultado = "O nadador está na categoria: JUVENIL B";
                    categoria.setText(resultado);
                }else{
                    String resultado = "O nadador está na categoria: SÊNIOR";
                    categoria.setText(resultado);
                }

            }
        });
    }
}
