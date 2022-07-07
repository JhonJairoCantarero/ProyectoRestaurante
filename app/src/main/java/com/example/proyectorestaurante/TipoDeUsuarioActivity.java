package com.example.proyectorestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class TipoDeUsuarioActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_de_usuario);

        spinner = (Spinner) findViewById(R.id.spinner);
        String [] respuestas = {"Cliente", "Repartidor"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,respuestas);
        spinner.setAdapter(adapter);



    }
}