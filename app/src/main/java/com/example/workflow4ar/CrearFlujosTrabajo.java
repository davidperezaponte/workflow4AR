package com.example.workflow4ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.workflow4ar.db.DbflujosTrabajo;

public class CrearFlujosTrabajo extends AppCompatActivity {

    EditText et_titulo;
    Button btnRegistrarFlujo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_flujos_trabajo);

        et_titulo = findViewById(R.id.et_titulo);
        btnRegistrarFlujo = findViewById(R.id.btnRegistrarFlujo);

        btnRegistrarFlujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbflujosTrabajo dbflujosTrabajo = new DbflujosTrabajo(CrearFlujosTrabajo.this);
                long id = dbflujosTrabajo.insertarFlujosTrabajo(et_titulo.getText().toString());

                if(id > 0){
                    Toast.makeText(CrearFlujosTrabajo.this,"REGISTRO EXITOSO",Toast.LENGTH_LONG).show();
                    limpiar();
                }else {
                    Toast.makeText(CrearFlujosTrabajo.this,"ERROR EN EL REGISTRO",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void limpiar(){
        et_titulo.setText("");
    }
}