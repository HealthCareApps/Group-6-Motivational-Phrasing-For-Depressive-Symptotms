package edu.fau.knapp.group6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class checkYourself extends AppCompatActivity implements View.OnClickListener{
    // Declare our view variables

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_yourself);
        // Assign the views from the layout file to the corresponding variables
        View activity_main = findViewById(R.id.mainmenu);
        activity_main.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mainmenu:
                Intent j = new Intent(this, MainActivity.class);
                startActivity(j);
                break;
        }
    }
}
