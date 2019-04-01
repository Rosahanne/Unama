package com.example.a26144859.appexemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Restaurante extends AppCompatActivity {

    private EditText nomeCliente;
    private Button btn_calcularConta;
    private TextView resultadoConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        nomeCliente = findViewById(R.id.ip_ncliente);
        resultadoConta = findViewById(R.id.txt_resConta);
        btn_calcularConta = findViewById(R.id.b_calcularconta);

        btn_calcularConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String letra = String.valueOf(nomeCliente.getText());
                String primeiraLetra = letra.substring(0,1);

                if (primeiraLetra.equals("a") ||
                        primeiraLetra.equals("e") ||
                        primeiraLetra.equals("i") ||
                        primeiraLetra.equals("o") ||
                        primeiraLetra.equals("u") ||
                        primeiraLetra.equals("A") ||
                        primeiraLetra.equals("E") ||
                        primeiraLetra.equals("I") ||
                        primeiraLetra.equals("O") ||
                        primeiraLetra.equals("U") ) {

                    resultadoConta.setText("Você terá desconto de 30% em sua conta");
               }else{
                    resultadoConta.setText("Que pena! Nesta semana o desconto não é para o seu nome, mas continue nos prestigiando que a sua vez chegará");
                }
            }
        });
    }
}
