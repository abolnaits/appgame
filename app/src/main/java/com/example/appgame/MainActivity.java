package com.example.appgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar_info(View vista){
        //Creo el intento para lanzar la actividad
        Intent intento = new Intent(this,InfoActivity.class);
        //Inicio la actividad
        startActivity(intento);
    }

}