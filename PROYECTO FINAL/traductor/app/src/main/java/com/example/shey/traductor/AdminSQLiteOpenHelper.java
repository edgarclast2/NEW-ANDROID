package com.example.shey.traductor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table palabras(id integer primary key autoincrement, palabra1 text, palabra2 text)");

    }

    //BORRAMOS LA TABLA

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionPosterior) {
      //  db.execSQL("drop table if exists palabras");
       // db.execSQL("create table palabras(id integer primary key autoincrement, palabra1 text, palabra2 text)");
    }
}
