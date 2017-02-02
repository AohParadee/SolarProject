package com.example.aoh.solarproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_choose);

    }//OnCreate

    public void clickPyramid1(View view) {
        startActivity(new Intent(MainChooseActivity.this, PlanetActivity1.class));
    }//clickPlanet

    public void clickPyramid2(View view) {
        startActivity(new Intent(MainChooseActivity.this, PlanetActivity2.class));
    }//clickTrick

}//MainClass
