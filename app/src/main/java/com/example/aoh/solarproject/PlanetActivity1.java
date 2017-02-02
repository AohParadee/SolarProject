package com.example.aoh.solarproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlanetActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet1);

    }//onCreate


    public void clickSun(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=MPtOEbkXUIo"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickMercury(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=0z7b6YC3MUo"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickVenus(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=9C4Kyhs997I&feature=youtu.be"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickEarth(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=y9J6gHIygbI"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickMars(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=y9J6gHIygbI"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clickJupiter(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=R5Z5cB4DfsI&feature=youtu.be"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}//main class
