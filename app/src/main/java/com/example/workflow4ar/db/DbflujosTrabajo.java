package com.example.workflow4ar.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbflujosTrabajo extends DbHelper{

    Context context;

    public DbflujosTrabajo(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarFlujosTrabajo(String titulo){

        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("titulo", titulo);

            id = db.insert(TABLE_FLUJOSTRABAJO, null, values);

        }catch (Exception e){
            e.toString();
        }
        return id;
    }
}
