package com.games.daniel.worldchallenge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;


public class StartScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        Timer t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(StartScreen.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }









    }

