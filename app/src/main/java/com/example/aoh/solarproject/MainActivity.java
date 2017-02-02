package com.example.aoh.solarproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   }//On Create

        public void clickPlanet(View view) {
        startActivity(new Intent(MainActivity.this, MainChooseActivity.class));
    }//clickPlanet

    public void clickTrick(View view) {
        startActivity(new Intent(MainActivity.this, TrickActivity.class));
    }//clickTrick

//    public void clickPyramid1(View view) {
//        startActivity(new Intent(MainActivity.this, PlanetActivity1.class));
//    }//clickTrick
//
//    public void clickPyramid2(View view) {
//        startActivity(new Intent(MainActivity.this, PlanetActivity2.class));
//    }//clickTrick

}//main class
