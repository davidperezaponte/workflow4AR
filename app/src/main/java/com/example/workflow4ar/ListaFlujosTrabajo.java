package com.example.workflow4ar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListaFlujosTrabajo extends AppCompatActivity {

    public String [] flujoTrabajo1 = {
            "VERIFICACIÓN DE SALIDAS DE CONTROL         DE RECERRADOR (VERIFICACIÓN DE         OPERACIÓN DE CIERRE / DISPARO)",
            "Verificar el número de serie del módulo de relés",
            "Número de serie del módulo de relé, verifique el número de serie en la parte posterior del módulo de relés",
            "@mipmap/serie_rele"
    };

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_flujos_trabajo);

        button = findViewById(R.id.btnFlujoTrabajo1);

        button.setText(flujoTrabajo1[0]);
    }

    public void verFlujo(View view){
        Intent i = new Intent(this,verFlujoTrabajo.class);
        startActivity(i);
    }

    public void salir(View view){
        finish();
    }
}