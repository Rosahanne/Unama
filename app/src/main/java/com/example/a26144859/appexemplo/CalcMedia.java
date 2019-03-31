package com.example.a26144859.appexemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcMedia extends AppCompatActivity {

    private EditText nomeAluno;
    private EditText nota1;
    private EditText nota2;
    private Button btn_calcDesempenho;
    private TextView desempenho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_media);

        nomeAluno = findViewById(R.id.n_aluno);
        nota1 = findViewById(R.id.n1);
        nota2 =  findViewById(R.id.n2);
        btn_calcDesempenho = findViewById(R.id.b_calc);
        desempenho = findViewById(R.id.desempAluno);

        btn_calcDesempenho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double av1 = Double.parseDouble(nota1.getText().toString());
                double av2 = Double.parseDouble(nota2.getText().toString());
                double media;
                
                media = (av1 + av2)/2;

                if (media >= 7) {
                    String resultado = "O aluno foi aprovado com média: " + media;
                    desempenho.setText(resultado);
                }else if (media >= 4){
                    String resultado = "O aluno deverá fazer prova final, sua média foi: " + media;
                    desempenho.setText(resultado);
                }else{
                    String resultado = "O aluno ficou reprovado com média: " + media;
                    desempenho.setText(resultado);
                }

            }
        });
    }
}
