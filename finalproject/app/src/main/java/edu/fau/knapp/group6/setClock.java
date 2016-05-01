package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.Calendar;
import java.util.Random;

public class setClock extends Activity {

    private ImageButton msettime, mselecttoone, mrepeatschedule, msavepref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_clock);




        //View object references
        msettime = (ImageButton) findViewById(R.id.settime);
        mselecttoone = (ImageButton) findViewById(R.id.selecttone);
        mrepeatschedule = (ImageButton) findViewById(R.id.repeatschedule);
        msavepref = (ImageButton) findViewById(R.id.savepref);

        msettime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(setClock.this, setTime.class);
                startActivity(intent);
            }
        });

        mselecttoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(setClock.this, selectTone.class);
                startActivity(intent);
            }
        });

        mrepeatschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(setClock.this, repeatSchedule.class);
                startActivity(intent);
            }
        });
//        msavepref.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Save User preferences
//            }
//        });
    }
}
