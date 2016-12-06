package com.example.aoh.solarproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpBgm;
    Button buttonPlanet, buttonTrick;
    ToggleButton bgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpBgm = MediaPlayer.create(MainActivity.this, R.raw.deep_electro_track);
        mpBgm.setLooping(true);
        mpBgm.start();

        buttonPlanet = (Button) findViewById(R.id.buttonPlanet);
        buttonPlanet.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.button_09);
                mpEffect.start();
                startActivity(new Intent(MainActivity.this, MainChooseActivity.class));
            }
        });

        buttonTrick = (Button) findViewById(R.id.buttonTrick);
        buttonTrick.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mpEffect
                        = MediaPlayer.create(MainActivity.this, R.raw.button_09);
                mpEffect.start();
                startActivity(new Intent(MainActivity.this, TrickActivity.class));
            }
        });

        bgm = (ToggleButton) findViewById(R.id.bgm);
        bgm.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                if (arg1)
                    mpBgm.start();
                else
                    mpBgm.pause();
            }
        });

    }//On Create


    public void onResume() {
        super.onResume();
        if (bgm.isChecked())
            mpBgm.start();
    }

    public void onPause() {
        super.onPause();
        mpBgm.pause();
    }

    public void onDestroy() {
        super.onDestroy();
        mpBgm.stop();
        mpBgm.release();
        mpBgm = null;
    }

    //    public void clickPlanet(View view) {
//        startActivity(new Intent(MainActivity.this, MainChooseActivity.class));
//    }//clickPlanet
//
//    public void clickTrick(View view) {
//        startActivity(new Intent(MainActivity.this, TrickActivity.class));
//    }//clickTrick

}//main class
