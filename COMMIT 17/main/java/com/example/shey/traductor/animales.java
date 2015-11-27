package com.example.shey.traductor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by SHEY on 25/11/2015.
 */
public class animales extends MainActivity {
    private MediaPlayer mp1, mp2, mp3, mp4;
    private ImageButton sperro, szorro, schancho, soveja;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animales);

// PARA EL SONIDO perro
        sperro =(ImageButton) findViewById(R.id.ibtnperro);
        sperro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1 = MediaPlayer.create(animales.this, R.raw.perro);
                mp1.start();
            }
        });

// PARA EL SONIDO zorro
        szorro =(ImageButton) findViewById(R.id.ibtnzorro);
        szorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2 = MediaPlayer.create(animales.this, R.raw.zorro);
                mp2.start();
            }
        });
        // PARA EL SONIDO chancho
        schancho =(ImageButton) findViewById(R.id.ibntchancho);
        schancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3 = MediaPlayer.create(animales.this, R.raw.chancho);
                mp3.start();
            }
        });
        // PARA EL SONIDO oveja
        soveja =(ImageButton) findViewById(R.id.ibtnoveja);
        soveja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4 = MediaPlayer.create(animales.this, R.raw.oveja);
                mp4.start();
            }
        });
    }


}