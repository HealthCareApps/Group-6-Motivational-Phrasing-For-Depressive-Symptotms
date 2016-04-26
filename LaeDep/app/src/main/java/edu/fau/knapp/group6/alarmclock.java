package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class alarmClock extends Activity {

    private ImageButton malarmclock, mmainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_clock);

        //View object references
        malarmclock = (ImageButton) findViewById(R.id.alarmclock);
        mmainmenu = (ImageButton) findViewById(R.id.mainmenu);

        malarmclock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alarmClock.this, setClock.class);
                startActivity(intent);
            }
        });

        mmainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alarmClock.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
