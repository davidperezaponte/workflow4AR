package com.example.workflow4ar.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "workflow4ar.db";
    public static final String TABLE_USUARIOS = "usuarios";
    public static final String TABLE_FLUJOSTRABAJO = "flujosTrabajo";
    public static final String TABLE_SECUENCIAS = "secuancias";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_USUARIOS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "usuario TEXT NOT NULL,"+
                "correo TEXT NOT NULL,"+
                "contrasena TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+TABLE_FLUJOSTRABAJO + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+TABLE_SECUENCIAS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo TEXT NOT NULL,"+
                "informacion TEXT NOT NULL,"+
                "rutaimagen TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    db.execSQL("DROP TABLE "+TABLE_USUARIOS);
    db.execSQL("DROP TABLE "+TABLE_FLUJOSTRABAJO);
    db.execSQL("DROP TABLE "+TABLE_SECUENCIAS);
    onCreate(db);

    }
}
