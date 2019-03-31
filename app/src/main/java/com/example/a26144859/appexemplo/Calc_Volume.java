package com.example.a26144859.appexemplo;


import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calc_Volume extends AppCompatActivity {

    public static final double CONSTANTE = 3.141559;
    private TextInputEditText altura;
    private TextInputEditText raio;
    private Button btnCalcular;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc__volume);

        altura = findViewById(R.id.inp_Altura);
        raio = findViewById(R.id.inp_Raio);
        btnCalcular = findViewById(R.id.btn_Calcular);
        resultado = findViewById(R.id.txtResult);
    }

    public void calcular(View v){
        double vlAltura = Double.parseDouble(altura.getText().toString());
        double vlRaio = Double.parseDouble(raio.getText().toString());
        double volume = CONSTANTE * (vlRaio * vlRaio) * vlAltura;
        String texto = "Valor do volume é: " + volume;
        resultado.setText(texto);
    }
}
