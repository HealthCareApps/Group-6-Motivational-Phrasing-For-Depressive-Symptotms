package edu.fau.knapp.group6;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class userPreferences extends Activity  {

    private ImageButton mcolorRatings, mpeopleDepo, mresetPW, mmainMenu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_preferences);

        //View object references
        mcolorRatings = (ImageButton) findViewById(R.id.colorRatings);
        mpeopleDepo = (ImageButton) findViewById(R.id.peopleDepo);
        mresetPW = (ImageButton) findViewById(R.id.resetPW);
        mmainMenu = (ImageButton) findViewById(R.id.mainMenu);

        //Onclick methods
        mcolorRatings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userPreferences.this, colorRatings.class);
                startActivity(intent);
            }
        });

        mpeopleDepo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userPreferences.this, peopleDepo.class);
                startActivity(intent);
            }
        });

        mresetPW.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userPreferences.this, resetPW.class);
                startActivity(intent);
            }
        });

        mmainMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userPreferences.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
