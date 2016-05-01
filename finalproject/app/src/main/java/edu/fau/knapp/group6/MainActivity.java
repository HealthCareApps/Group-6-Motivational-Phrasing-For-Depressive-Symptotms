package edu.fau.knapp.group6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.widget.ImageButton;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.widget.ImageButton;


public class MainActivity extends Activity {
    private static final String TAG = "Main";
    private ImageButton mcheckButton, mclockButton, muserButton, mlogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View Object references
        mcheckButton = (ImageButton) findViewById(R.id.check_button);
        mclockButton = (ImageButton) findViewById(R.id.clock_button);
        muserButton = (ImageButton) findViewById(R.id.user_button);
        mlogButton = (ImageButton) findViewById(R.id.log_button);

        //Button onclick listeners

        mcheckButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, checkYourself.class);
                startActivity(intent);
            }
        });

        mclockButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, alarmclock.class);
                startActivity(intent);
            }
        });

        muserButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, userPreferences.class);
                startActivity(intent);
            }
        });
        mlogButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}


