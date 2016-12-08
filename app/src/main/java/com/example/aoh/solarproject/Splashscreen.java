package com.example.aoh.solarproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

public class Splashscreen extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    MediaPlayer mpBgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);

        mpBgm = MediaPlayer.create(Splashscreen.this, R.raw.deep_electro_track);
        mpBgm.setLooping(true);
        mpBgm.start();

        // Load the ImageView that will host the animation and
        // set its background to our AnimationDrawable XML resource.
            ImageView img = (ImageView)findViewById(R.id.load_image);
            img.setBackgroundResource(R.drawable.animations);

        // Get the background, which has been compiled to an AnimationDrawable object.
            AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

        // Start the animation (looped playback by default).
            frameAnimation.start();


        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
    }//On Create

    public void onResume() {
        super.onResume();
        handler.postDelayed(runnable, 5000);
    }

    public void onStop() {
        super.onStop();
        handler.removeCallbacks(runnable);

    }

    public void onDestroy() {
        super.onDestroy();
        mpBgm.stop();
        mpBgm.release();
        mpBgm = null;
    }

}//main class
