package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int yugiLP = 8000;
    int kaibaLP = 8000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    Yugi cards
     */
    public void attackKaiba1(View v) {
        kaibaLP = kaibaLP - 2500;
        if (kaibaLP < 0)
        kaibaLP = 0;
        displayKaiba(kaibaLP);
    }

    public void attackKaiba2(View v) {
        kaibaLP = kaibaLP - 2000;
        if (kaibaLP < 0)
            kaibaLP = 0;
        displayKaiba(kaibaLP);
    }

    public void attackKaiba3(View v) {
        kaibaLP = kaibaLP - 300;
        if (kaibaLP < 0)
            kaibaLP = 0;
        displayKaiba(kaibaLP);
    }

    /*
    Kaiba cards
     */
    public void attackYugi1(View v) {
        yugiLP = yugiLP - 3000;
        if (yugiLP < 0)
            yugiLP = 0;
        displayYugi(yugiLP);
    }

    public void attackYugi2(View v) {
        yugiLP = yugiLP - 2200;
        if (yugiLP < 0)
            yugiLP = 0;
        displayYugi(yugiLP);
    }

    public void attackYugi3(View v) {
        yugiLP = yugiLP - 600;
        if (yugiLP < 0)
            yugiLP = 0;
        displayYugi(yugiLP);
    }

    /*
    New Game
     */
    public void reset(View v) {
        yugiLP = 8000 ;
        kaibaLP = 8000;
        displayYugi(yugiLP);
        displayKaiba(kaibaLP);
    }




    public void displayKaiba(int LifePoints) {
        TextView scoreView = findViewById(R.id.kaibalp);
        scoreView.setText(LifePoints +" LP");

    }

    public void displayYugi(int LifePoints) {
        TextView scoreView = findViewById(R.id.yugilp);
        scoreView.setText(LifePoints+ " LP");

    }


}