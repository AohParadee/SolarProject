package com.example.aoh.solarproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlanetActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet2);

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


}//main class
