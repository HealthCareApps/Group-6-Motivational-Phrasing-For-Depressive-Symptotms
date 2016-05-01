package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class resetPW extends Activity {

    private ImageButton msavepref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_pw);

        //View object references
        msavepref = (ImageButton) findViewById(R.id.savepref);

        msavepref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Save User preferences
            }
        });
    }
}
