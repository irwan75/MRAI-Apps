package com.example.mraiapps.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String dbName = "MRAI_db";
    private static final int dbVersion = 1;

    public SQLiteHelper(Context context) {
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbAuthLogin = "CREATE TABLE authlogin (stambuk BIGINT PRIMARY KEY, password BIGINT, role VARCHAR(30))";
        db.execSQL(tbAuthLogin);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
