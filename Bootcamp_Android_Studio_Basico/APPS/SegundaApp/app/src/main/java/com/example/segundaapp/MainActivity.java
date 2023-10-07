package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_mate);
        et2=(EditText)findViewById(R.id.txt_fisica);
        et3=(EditText)findViewById(R.id.txt_qumica);
        tv1=(TextView)findViewById(R.id.tv_estatus);
    }

    public void estatus(View view){
        String Mate_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int Mate_int = Integer.parseInt(Mate_String);
        int Fisica_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);

        int promedio = (Mate_int + Fisica_int + Quimica_int)/3;

        if(promedio >= 6){
            tv1.setText("Alumno Aprobó con: " + promedio);
        }else if(promedio <= 5){
            tv1.setText("Alumno Desaprobo con: " + promedio);
        }
    }
}