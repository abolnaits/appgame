package com.example.appgame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Toolbar
    //private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
    }

    public void ejecutar_info(View vista){
        //Creo el intento para lanzar la actividad
        Intent intento = new Intent(this,InfoActivity.class);
        //Inicio la actividad
        startActivity(intento);
    }

    public void salir(View vista){
        finish();
    }

    //Creamos el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Obtenemos el Menu
        this.getMenuInflater().inflate(R.menu.menu_en_activity,menu);
        //return true;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Capturar el ID del Item del Menu
        int id = item.getItemId();
        System.out.println("Item ID ==>"+id);
        if(id == R.id.itemOtros){
            ejecutar_info(null);
            return true;
        }
        if(id == R.id.itemJugar){
            return true;
        }

        //Retornamos el valor por defecto
        return super.onOptionsItemSelected(item);

    }
}