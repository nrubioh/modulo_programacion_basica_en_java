package com.example.tercerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1, et_valor2;
    private RadioButton rb_suma, rb_resta, rb_mult, rb_div;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creación de relaciones
        et_valor1=(EditText)findViewById(R.id.txtN1);
        et_valor2=(EditText)findViewById(R.id.txtN2);
        rb_suma=(RadioButton)findViewById(R.id.rb1);
        rb_resta=(RadioButton)findViewById(R.id.rb2);
        rb_mult=(RadioButton)findViewById(R.id.rb3);
        rb_div=(RadioButton)findViewById(R.id.rb4);
        tv_result=(TextView)findViewById(R.id.txtView_result);
    }

        //metodo boton
    public void Calcular(View view){
        String valor1_String = et_valor1.getText().toString();
        String valor2_String = et_valor2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if(rb_suma.isChecked() == true){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv_result.setText(resultado);
        } else if(rb_resta.isChecked() == true){
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv_result.setText(resultado);
        } else if(rb_mult.isChecked() == true){
            int mult = valor1_int * valor2_int;
            String resultado = String.valueOf(mult);
            tv_result.setText(resultado);
        } else if(rb_div.isChecked() == true){
            if(valor2_int != 0){
                int div = valor1_int / valor2_int;
                String resultado = String.valueOf(div);
                tv_result.setText(resultado);
            } else{
                Toast.makeText(this,"El 2do valor debe ser != 0", Toast.LENGTH_LONG).show();
            }
        }
    }
}