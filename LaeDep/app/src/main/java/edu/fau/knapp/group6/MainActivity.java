package edu.fau.knapp.group6;

import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Click listeners for all the buttons
        View checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(this);
        View clockButton = findViewById(R.id.clock_button);
        clockButton.setOnClickListener(this);
        View userButton = findViewById(R.id.user_button);
        userButton.setOnClickListener(this);
        View logButton = findViewById(R.id.log_button);
        logButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.check_button:
                Intent i = new Intent(this, checkYourself.class);
                startActivity(i);
                break;
            case R.id.clock_button:
                Intent j = new Intent(this, clock.class);
                startActivity(j);
                break;
            case R.id.user_button:
                Intent k = new Intent(this, users.class);
                startActivity(k);
                break;
            case R.id.log_button:
                finish();
                break;

        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemsSelected(MenutItem item){
        switch (item.getItemId()){
            case.R.id.settings:
            startActivity(new Intent(this, Prefs.class));
            return true;
        }
        return false;
    }*/
}


