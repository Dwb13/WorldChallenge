package com.games.daniel.worldchallenge;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import java.lang.String;

/**
 * Created by Daniel on 29/10/2017.
 */

public class Pais extends AppCompatActivity {
    String nombre;
    Drawable bandera;

    public Pais(){

    }
    public Pais (String nombre, Drawable bandera){
        this.nombre=nombre;
        this.bandera=bandera;
    }
}
