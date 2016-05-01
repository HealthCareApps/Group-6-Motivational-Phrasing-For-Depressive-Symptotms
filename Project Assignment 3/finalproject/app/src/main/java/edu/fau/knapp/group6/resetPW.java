package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class resetPW extends Activity {

    private ImageButton msavepref,  mcancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_pw);

        //View object references
        msavepref = (ImageButton) findViewById(R.id.savepref);
        mcancel = (ImageButton) findViewById(R.id.cancel);

        msavepref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(resetPW.this,"Password saved!", Toast.LENGTH_SHORT).show();

            }
        });
        mcancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(resetPW.this, colorRatings.class);
                startActivity(intent);

            }
        });
    }
}
