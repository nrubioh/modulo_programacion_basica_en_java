package com.example.sextaappswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;
    private EditText et1, et2;
    private Switch sw1, sw2;
    private Spinner sp1;
    private ViewGroup tContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tContainer = (ViewGroup)findViewById(R.id.transitionContainer);

        tv1 = (TextView)findViewById(R.id.id_TextView1);
        tv2 = (TextView)findViewById(R.id.id_TextView2);
        et1 = (EditText)findViewById(R.id.id_editTextNumber1);
        et2 = (EditText)findViewById(R.id.id_editTextNumber2);
        sw1 = (Switch)findViewById(R.id.id_Switch1);
        sw2 = (Switch)findViewById(R.id.id_Switch2);
        sp1 = (Spinner)findViewById(R.id.id_Spinner);

        String [] options = {"Suma","Resta","Multiplicar","Dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,options);
        sp1.setAdapter(adapter);

        sw2.setOnClickListener(new View.OnClickListener(){

            boolean visible;
            @Override
            public void onClick (View view){

                TransitionManager.beginDelayedTransition(tContainer);
                visible = !visible;
                tv2.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
    }
    //boton
    public void Boton(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String select = sp1.getSelectedItem().toString();
        if(select.equals("Suma")){
            int suma = valor1_int + valor2_int;
            String result = String.valueOf(suma);
            tv2.setText(result);
        } else if(select.equals("Resta")){
            int resta = valor1_int - valor2_int;
            String result = String.valueOf(resta);
            tv2.setText(result);
        } else if(select.equals("Multiplicar")){
            int mult = valor1_int * valor2_int;
            String result = String.valueOf(mult);
            tv2.setText(result);
        } else if(select.equals("Dividir")){
            if(valor2_int != 0){
                int div = valor1_int / valor2_int;
                String result = String.valueOf(div);
                tv2.setText(result);
            } else{
                Toast.makeText(this, "El 2do valor tiene que ser != a 0",Toast.LENGTH_LONG).show();
            }
        }
    }
}