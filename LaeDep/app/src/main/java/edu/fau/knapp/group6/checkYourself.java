package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class checkYourself extends Activity {
    // Declare our view variables
    private ImageButton mcheck_yourself_button, mtravel_button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_yourself);

        //View object references
        mcheck_yourself_button = (ImageButton) findViewById(R.id.check_yourself_button);
        mtravel_button = (ImageButton) findViewById(R.id.travel_button);

        //Onclick methods
        mcheck_yourself_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkYourself.this, checkAR.class);
                startActivity(intent);
            }
        });

        mtravel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkYourself.this, travelMode.class);
                startActivity(intent);
            }
        });

    }
}
