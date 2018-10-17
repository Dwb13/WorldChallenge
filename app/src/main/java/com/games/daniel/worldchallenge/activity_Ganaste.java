package com.games.daniel.worldchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_Ganaste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ganaste);
        Button inicio;
        Button nextLevel;
        inicio=(Button)findViewById(R.id.inicioA);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_Ganaste.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextLevel=(Button)findViewById(R.id.nextLevel);
        nextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_Ganaste.this, Level2.class);
                startActivity(intent);
            }
        });
    }
}
