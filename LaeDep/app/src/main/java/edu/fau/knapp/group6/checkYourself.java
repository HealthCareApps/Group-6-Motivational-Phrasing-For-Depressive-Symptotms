package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;


public class checkYourself extends Activity {
    // Declare our view variables
    private ImageButton mcheck_yourself_button, mtravel_button, mmainMenu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_yourself);

        //View object references
        mcheck_yourself_button = (ImageButton) findViewById(R.id.check_yourself_button);
        mtravel_button = (ImageButton) findViewById(R.id.travel_button);
        mmainMenu = (ImageButton) findViewById(R.id.mainMenu);

        //Onclick methods
        mcheck_yourself_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkYourself.this, checkAR.class);
                startActivity(intent);
            }
        });

        mtravel_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkYourself.this, travelMode.class);
                startActivity(intent);
            }
        });

        mmainMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkYourself.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
