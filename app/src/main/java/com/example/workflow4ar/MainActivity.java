package com.example.workflow4ar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.workflow4ar.db.DbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void verFlujos(){
        Intent i = new Intent(this,ListaFlujosTrabajo.class);
        startActivity(i);
    }

    private void crearFlujos(){
        Intent i = new Intent(this,CrearFlujosTrabajo.class);
        startActivity(i);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_crear:
                crearFlujos();
                return true;

            case  R.id.menu_ver:
                verFlujos();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}