package com.example.workflow4ar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class verFlujoTrabajo extends AppCompatActivity {

    Button btnSiguiente, btnAtras;
    private TextView tvTitulo, tvTituloPaso1,tvInfo;
    private ImageView image;
    public String [][] flujoTrabajo1 = {
            {"VERIFICACIÓN DE SALIDAS DE CONTROL         DE RECERRADOR (VERIFICACIÓN DE         OPERACIÓN DE CIERRE / DISPARO)",
            "Verificar el número de serie del módulo de relés",
            "Número de serie del módulo de relé, verifique el número de serie en la parte posterior del módulo de relés",
            "@mipmap/serie_rele"},
            {"VERIFICACIÓN DE SALIDAS DE CONTROL         DE RECERRADOR (VERIFICACIÓN DE         OPERACIÓN DE CIERRE / DISPARO)",
            "Versión del paquete de firmware y fecha de lanzamiento del paquete de firmware",
            "Verifique la versión del paquete de firmware y la fecha de lanzamiento en la pantalla de inicio LCD o\n" +
                    "\"MANTENIMIENTO>> CONTROL INFO (botón [ARRIBA] presionado * 2)\" del menú LCD.",
            "@mipmap/version_firmware"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_flujo_trabajo);

        btnSiguiente = findViewById(R.id.btnSiguiente);
        btnAtras = findViewById(R.id.btnAtras);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvTituloPaso1 = findViewById(R.id.tvTituloPaso1);
        tvInfo = findViewById(R.id.tvInfo);
        image = findViewById(R.id.imagePaso1);

        //Cargar titulo del flujo de trabajo desde base de datos
        tvTitulo.setText(""+flujoTrabajo1[0][0]);

        //Cargar titulo del paso desde base de datos
        tvTituloPaso1.setText(""+flujoTrabajo1[0][1]);

        //Cargar información del paso desde base de datos
        tvInfo.setText(""+flujoTrabajo1[0][2]);

        //Cargar imagen desde la ruta especificada
        int imageResource = getResources().getIdentifier(flujoTrabajo1[0][3],null,getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        image.setImageDrawable(res);

    }


    public void pasoSiguiente(View view){
        tvTitulo.setText(""+flujoTrabajo1[1][0]);

        //Cargar titulo del paso desde base de datos
        tvTituloPaso1.setText(""+flujoTrabajo1[1][1]);

        //Cargar información del paso desde base de datos
        tvInfo.setText(""+flujoTrabajo1[1][2]);

        //Cargar imagen desde la ruta especificada
        int imageResource = getResources().getIdentifier(flujoTrabajo1[1][3],null,getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        image.setImageDrawable(res);
    }

    public void pasoAnterior(View view){
        //Cargar titulo del flujo de trabajo desde base de datos
        tvTitulo.setText(""+flujoTrabajo1[0][0]);

        //Cargar titulo del paso desde base de datos
        tvTituloPaso1.setText(""+flujoTrabajo1[0][1]);

        //Cargar información del paso desde base de datos
        tvInfo.setText(""+flujoTrabajo1[0][2]);

        //Cargar imagen desde la ruta especificada
        int imageResource = getResources().getIdentifier(flujoTrabajo1[0][3],null,getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        image.setImageDrawable(res);
    }

    public void inicio(View view){
        finish();
    }
}