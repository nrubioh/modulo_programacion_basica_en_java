package com.example.cuartaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox cb_suma, cb_resta, cb_mult, cb_div;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtN1);
        et2 = (EditText)findViewById(R.id.txtN2);
        cb_suma = (CheckBox)findViewById(R.id.cb1);
        cb_resta = (CheckBox)findViewById(R.id.cb2);
        cb_mult = (CheckBox)findViewById(R.id.cb3);
        cb_div = (CheckBox)findViewById(R.id.cb4);
        tv_resultado = (TextView)findViewById(R.id.txtView_result);
    }
    //fn boton
    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String resultado = "";

        if(cb_suma.isChecked() == true){
            int suma = valor1_int + valor2_int;
            resultado = " La suma es: " + suma + " / ";
        }
        if(cb_resta.isChecked() == true){
            int resta = valor1_int - valor2_int;
            resultado = resultado + " La resta es: " + resta + " / ";
        }
        if(cb_mult.isChecked() == true){
            int mult = valor1_int * valor2_int;
            resultado = resultado + " La multiplicación es: " + mult + " / ";
        }
        if(cb_div.isChecked() == true){
            if(valor2_int !=0){
                int div = valor1_int / valor2_int;
                resultado = resultado + "La división es: " + div + " / ";
            } else{
                Toast.makeText(this,"El 2do valor debe ser != 0", Toast.LENGTH_LONG).show();
            }
        }
        tv_resultado.setText(resultado);
    }
}