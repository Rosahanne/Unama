package com.example.a26144859.appexemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcValorY extends AppCompatActivity {

    private EditText numero_x;
    private Button btn_calc_y;
    private TextView numero_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_valor_y);

        numero_x = findViewById(R.id.numero_x);
        btn_calc_y = findViewById(R.id.b_calcCategoria);
        numero_y = findViewById(R.id.resultadoY);


        btn_calc_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Double.parseDouble(numero_x.getText().toString());
                double y;

                if (x != 2) {
                    y = 8 / (2 - x);

                    String resultado = "O valor de y é: " + y;
                    numero_y.setText(resultado);
                }else{
                    Toast toast=Toast.makeText(getApplicationContext(),"O  número não pode ser 2",Toast.LENGTH_SHORT); toast.setMargin(50,50); toast.show();
                }
            }
        });
    }
}
