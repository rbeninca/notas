package com.example.app;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        sqLiteDatabase =openOrCreateDatabase("notas",MODE_PRIVATE,null);

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT , nota TEXT)");
        //String titulo=" joão' ; TRUCATE TABLE ;'   ";
        //sqLiteDatabase.execSQL("INSERT INTO notas VALUES (1,' "+titulo+ "','') ");

        /*  nomeColuna, valor    */
        ContentValues  contentValues=new ContentValues();
        contentValues.put("titulo","joão");
        contentValues.put("nota","777777777777");
        sqLiteDatabase.insert("notas",null,contentValues);
        ListView lv=findViewById(R.id.listview);


        //Recuperar Dados do SQLITE
        Cursor c= sqLiteDatabase.rawQuery("SELECT id,id*10,titulo,nota FROM notas",null);
        c.moveToFirst() ; //movimenta o ponteiro do cursor para o primeiro registro recuperado
        ArrayList<Nota> listaNotas =new ArrayList<>();
        while (!c.isAfterLast()) {
            @SuppressLint("Range") int id = c.getInt(c.getColumnIndex("id"));
            @SuppressLint("Range") String titulo = c.getString(c.getColumnIndex("titulo"));
            @SuppressLint("Range") String nota = c.getString(c.getColumnIndex("nota"));
            Nota n = new Nota( id,titulo,nota);
            listaNotas.add(n);
            Log.d("SELECT", Integer.toString(id) + "," + titulo + "," + nota);
            c.moveToNext();
        }

        ArrayList<String> listaTitulos = new ArrayList<>();
        for (Nota nota :listaNotas) {
            listaTitulos.add(nota.titulo);
        }

        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1,listaTitulos);
        lv.setAdapter(adapter);

    }
}