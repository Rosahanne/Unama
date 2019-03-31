package com.example.a26144859.appexemplo;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mainBtn;
    private TextInputEditText vlConta;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBtn = findViewById(R. id.btnCalcular);
        vlConta = findViewById(R. id.inputValor);
        resultado = findViewById(R. id.txtResultado);

    }

    public void calcular(View v){
        double conta = Double.parseDouble(vlConta.getText().toString());
        double res = conta * 1.1;
        String texto = "Valor da conta é: " + res;
        resultado.setText(texto);
    }

}
