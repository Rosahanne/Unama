package com.example.a26144859.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PesoIdeal extends AppCompatActivity {

    private RadioGroup op_sexo;
    private TextInputEditText pId_altura;
    private Button pId_btnCalcular;
    private TextView pId_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal);

        op_sexo = findViewById(R.id.rd_sexo);
        pId_altura = findViewById(R.id.inp_altura);
        pId_btnCalcular = findViewById(R.id.btn_calcularpId);
        pId_resultado = findViewById(R.id.txt_pesoIdeal);

    }

    public void CalcPesoIdeal(View v){
        double altura = Double.parseDouble(pId_altura.getText().toString());
        double resultado = Double.parseDouble(pId_resultado.getText().toString());
        if(op_sexo.getCheckedRadioButtonId() == R.id.radioBtn_Feminino) {
            resultado = (61.1 * altura) - 44.7;
        }else{
            resultado = (72.7 * altura) - 58;
        }
        String mensagem = "Valor do volume é: " + resultado;
        pId_resultado.setText(mensagem);
    }
}
