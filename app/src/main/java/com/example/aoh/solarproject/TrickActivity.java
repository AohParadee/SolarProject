package com.example.aoh.solarproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TrickActivity extends AppCompatActivity {

    MediaPlayer mpBgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trick);

        mpBgm = MediaPlayer.create(TrickActivity.this, R.raw.deep_electro_track);
        mpBgm.setLooping(true);
        mpBgm.start();

    }//main method

    public void onDestroy() {
        super.onDestroy();
        mpBgm.stop();
        mpBgm.release();
        mpBgm = null;
    }

}//main class