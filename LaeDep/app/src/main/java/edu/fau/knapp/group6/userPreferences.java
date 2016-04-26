package edu.fau.knapp.group6;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class userPreferences extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_preferences);
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
