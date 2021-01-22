package com.example.appgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;

public class InfoActivity extends Activity {

    //Archivo Main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
    }
    //Creamos el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Obtenemos el Menu
        this.getMenuInflater().inflate(R.menu.menu_en_activity,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Capturar el ID del Item del Menu
        int id = item.getItemId();
        System.out.println("Item ID ==>"+id);
        if(id == R.id.itemOtros){
            //ejecutar_info(null);
            return true;
        }
        if(id == R.id.itemJugar){
            return true;
        }

        //Retornamos el valor por defecto
        return super.onOptionsItemSelected(item);

    }

}
