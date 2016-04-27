package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class peopleDepo extends Activity {

    private ImageButton msavepref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people_depo);

        //View object references
        msavepref = (ImageButton) findViewById(R.id.savepref);

        msavepref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Save User preferences
            }
        });

        //Function to add people to list in people depo
    }
}
