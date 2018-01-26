package com.example.viewsdia2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView candado, cerrar, añadir, guardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        candado = (TextView)findViewById(R.id.textocandado);
        cerrar = (TextView)findViewById(R.id.textocerrar);
        añadir = (TextView)findViewById(R.id.textoañadir);
        guardar = (TextView)findViewById(R.id.textoguardar);



        candado.setText("candado");
        cerrar.setText("cerrar");
        añadir.setText("añadir");
        guardar.setText("guardar");


    }

    public void escribircerrar(View view){cerrar.setText("Has pulsado cerrar");}
    public void escribircandado(View view){candado.setText("Has pulsado candado");}
    public void escribirañadir(View view){añadir.setText("Has pulsado añadir");}
    public void escribirguardar(View view){guardar.setText("Has pulsado guardar");}

    public void limpiar(View view){

        cerrar.setText("cerrar");
        candado.setText("candado");
        añadir.setText("añadir");
        guardar.setText("guardar");

    }







    }



