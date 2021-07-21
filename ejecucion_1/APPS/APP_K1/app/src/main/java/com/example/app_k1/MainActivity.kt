package com.example.app_k1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cualquiercosa()
        aca_numeros()
    }
    private fun cualquiercosa(){
        var variable1="primera frase con kotlin";
        println(variable1);

        var variable2= 2;
        println(variable2);

        val constante1= "esta no cambia";
        println(constante1);
        //val constante1="quiero que cambie";

        val constante2= variable1;
        println(constante2);

    }
    private fun aca_numeros(){
        val frase1 = "hello";
        val frase2 = "como estas?";
        val frase3 = frase1 +""+ frase2;
        println(frase3);

        val num1 = 32;
        val num2 = 2.63f;
        val num3 = 3.9;
        val num4 = num1 + num2 + num3;
        println(num4);

        val booleano1 = true;
        val booleano2 = false;
        println(booleano1 == booleano2);
        print(booleano1 && booleano2); //suma logica;

    }
}