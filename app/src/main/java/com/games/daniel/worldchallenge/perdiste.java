package com.games.daniel.worldchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perdiste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdiste);
        Button inicioP;
        inicioP=(Button)findViewById(R.id.inicioP);
        inicioP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(perdiste.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
