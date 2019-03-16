package com.example.a26144859.appexemplo;

import android.app.Activity;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity_CalcLigacao extends AppCompatActivity {


    private Spinner spOperadora;
    private TextInputEditText tempoLigacao;
    private TextView valorTotal;
    private Button btn_calcularLigacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__calc_ligacao);


        tempoLigacao = findViewById(R.id.ipL_tempoLigacao);
        valorTotal = findViewById(R.id.txt_ValorTotal);
        btn_calcularLigacao = findViewById(R.id.btn_CalcLig);



        btn_calcularLigacao.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                if (spOperadora == Op1) {

                }




            }

        });

        private void carregaSpinner(Activity Main2Activity_CalcLigacao){
            spOperadora = findViewById(R.id.sp_Op);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource

                    (this.activity,R.array.lista_Operadoras,

                            android.R.layout.simple_spinner_item);

            spOperadora.setAdapter(adapter);

        }


    }


}
