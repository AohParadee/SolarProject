package com.example.aoh.solarproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlanetActivity2 extends AppCompatActivity {

    MediaPlayer mpBgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet2);

        mpBgm = MediaPlayer.create(PlanetActivity2.this, R.raw.deep_electro_track);
        mpBgm.setLooping(true);
        mpBgm.start();

//        MyAlert myAlert = new MyAlert();
//        myAlert.myDialog(this, "เลือกดาวเคราะห์", "กรุณาเลือกดาวเคราะห์เพื่อชมวิดีโอ");

    }//onCreate

    public void clickSun(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=3rqQB3AwJGM&feature=youtu.be"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickMercury(View view) {
        Uri uri = Uri.parse(""); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickVenus(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=2GB-rXQQtT0&feature=youtu.be"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickEarth(View view) {
        Uri uri = Uri.parse(""); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void onDestroy() {
        super.onDestroy();
        mpBgm.stop();
        mpBgm.release();
        mpBgm = null;
    }


}//main class
