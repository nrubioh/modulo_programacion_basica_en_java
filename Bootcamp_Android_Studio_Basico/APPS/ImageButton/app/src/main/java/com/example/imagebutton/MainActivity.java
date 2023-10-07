package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MensajeGato(View view){
        Toast.makeText(this, "Este es un gatito", Toast.LENGTH_LONG).show();
    }
    public void MensajePerro(View view){
        Toast.makeText(this, "Este es un perrito", Toast.LENGTH_LONG).show();
    }
}