package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class colorRatings extends Activity {

    private ImageButton msavepref;
    private Button mred, myellow, mgreen, mblue, mpurple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_ratings);

        //View object references
        msavepref = (ImageButton) findViewById(R.id.savepref);
        mred = (Button) findViewById(R.id.red);
        myellow = (Button) findViewById(R.id.yellow);
        mgreen = (Button) findViewById(R.id.green);
        mblue = (Button) findViewById(R.id.blue);
        mpurple = (Button) findViewById(R.id.purple);

        //Onclick listener
        msavepref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(colorRatings.this, "Preferences saved!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
