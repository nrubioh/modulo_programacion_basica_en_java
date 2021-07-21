package com.example.quintaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_n1);
    }

    //metodo buttons
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, QuintaAppB.class);
        startActivity(siguiente);
    }
    public void Enviar(View view){
        Intent i = new Intent(this, QuintaAppB.class);
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);
    }
}