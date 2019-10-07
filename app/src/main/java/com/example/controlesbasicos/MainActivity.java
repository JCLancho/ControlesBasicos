package com.example.controlesbasicos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

//Ejercicio 1
/*
public class MainActivity extends AppCompatActivity {

    private EditText primerValor, segundoValor;
    private TextView resultado;
    private Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        primerValor = findViewById(R.id.primerValor);
        segundoValor = findViewById(R.id.segundoValor);
        resultado = findViewById(R.id.resultado);
        boton = findViewById(R.id.sumar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });
        setSupportActionBar(toolbar);

    }


    public void sumar(){

        int a = Integer.parseInt(primerValor.getText().toString());
        int b = Integer.parseInt(segundoValor.getText().toString());
        resultado.setText((a+b)+"");

    }
}
*/

// Ejercicio 2
/*
public class MainActivity extends AppCompatActivity {

    private EditText primerValor, segundoValor;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        primerValor = findViewById(R.id.primerValor);
        segundoValor = findViewById(R.id.segundoValor);
        resultado = findViewById(R.id.resultado);
        setSupportActionBar(toolbar);

    }


    public void operar(View v){

        int a = Integer.parseInt(primerValor.getText().toString());
        int b = Integer.parseInt(segundoValor.getText().toString());
        if(v.getId() == R.id.sumar){
            resultado.setText((a+b)+"");
        }else if(v.getId() == R.id.restar){
            resultado.setText((a-b)+"");
        }else if(v.getId() == R.id.multiplicar){
            resultado.setText((a*b)+"");
        }else{
            if(b != 0){
                resultado.setText((a/b)+"");
            }else{
                resultado.setText("");
            }
        }

    }
}
*/

//Ejercicio 3
/*
public class MainActivity extends AppCompatActivity {

    private ConstraintLayout fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo = findViewById(R.id.fondo);

    }

    public void colorFondo(View v){

        if(v.getId() == R.id.apagar){
            fondo.setBackgroundColor(Color.BLACK);
        }else{
            fondo.setBackgroundColor(Color.WHITE);
        }

    }
}
*/

//Ejercicio 4
/*
public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private EditText numero, letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        resultado = findViewById(R.id.resultado);
        numero = findViewById(R.id.numero);
        letra = findViewById(R.id.letra);

    }

    public void validar(View v){

        if(comprobar()){
            resultado.setText("Correcto");
        }else{
            resultado.setText("Error");
        }

    }

    public boolean comprobar(){

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String l = letra.getText().toString();
        int n = Integer.parseInt(numero.getText().toString());

        return (letras.charAt(n%23) == l.charAt(0));

    }


}
*/

//Ejercicio 5
/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView resultado;
    private Button bing, google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        resultado = findViewById(R.id.logo);
        bing = findViewById(R.id.bing);
        google = findViewById(R.id.google);

        //mediante setOnClickListener
        bing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setImageResource(R.drawable.bing);
            }
        });

        //mediante la implementacion de OnClickListener en la clase
        google.setOnClickListener(this);

    }

    //mediant onclick en el xml
    public void yahoo(View v){
        resultado.setImageResource(R.drawable.yahoo);
    }


    public void onClick(View view){
        resultado.setImageResource(R.drawable.google);
    }

}
*/

//Ejercicio 6
public class MainActivity extends AppCompatActivity {

    private ToggleButton botonCamara2, botonLuz2;
    private Switch switchCamara1, switchLuz1;
    private ImageView imagenCamara1, imagenCamara2, imagenLuz1, imagenLuz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        botonCamara2 = findViewById(R.id.botonCamara2);
        botonLuz2 = findViewById(R.id.botonLuz2);
        switchCamara1 = findViewById(R.id.switchCamara1);
        switchLuz1 = findViewById(R.id.switchLuz1);
        imagenCamara1 = findViewById(R.id.imagenCamara1);
        imagenCamara2 = findViewById(R.id.imagenCamara2);
        imagenLuz1 = findViewById(R.id.imagenLuz1);
        imagenLuz2 = findViewById(R.id.imagenLuz2);

    }

    public void toggleCamara(View v){
        if(botonCamara2.isChecked()){
            imagenCamara2.setImageResource(R.drawable.camara);
        }else{
            imagenCamara2.setImageResource(0);
        }

        if(switchCamara1.isChecked()){
            imagenCamara1.setImageResource(R.drawable.camara);
        }else{
            imagenCamara1.setImageResource(0);
        }
    }

    public void toggleLuz(View v){
        if(botonLuz2.isChecked()){
            imagenLuz2.setImageResource(R.drawable.bombilla_encendida);
        }else{
            imagenLuz2.setImageResource(R.drawable.bombilla_apagada);
        }

        if(switchLuz1.isChecked()){
            imagenLuz1.setImageResource(R.drawable.bombilla_encendida);
        }else{
            imagenLuz1.setImageResource(R.drawable.bombilla_apagada);
        }
    }

}