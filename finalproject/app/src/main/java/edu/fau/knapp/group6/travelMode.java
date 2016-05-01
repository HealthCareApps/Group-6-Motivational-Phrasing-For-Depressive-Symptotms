package edu.fau.knapp.group6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class travelMode extends Activity {

    private ImageButton mlightRed, mdarkRed, mlightYellow, mdarkYellow, mlightGreen, mdarkGreen, mlightBlue, mdarkBlue,
            mlightPurple, mdarkPurple, mbaskerville, mfranklingothic, mgeorgia, mhelvetica, mneutra, mcircle,
            mhexagon, mslantedlines, msquare, mtriangle, mcancel;




    private Double color, font, shape, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel_mode);

        color = 0.0;
        font = 0.0;
        shape = 0.0;

        mlightRed = (ImageButton) findViewById(R.id.lightRed);
        mdarkRed = (ImageButton) findViewById(R.id.darkRed);
        mlightYellow = (ImageButton) findViewById(R.id.lightYellow);
        mdarkYellow = (ImageButton) findViewById(R.id.darkYellow);
        mlightGreen = (ImageButton) findViewById(R.id.lightGreen);
        mdarkGreen = (ImageButton) findViewById(R.id.darkGreen);
        mlightBlue = (ImageButton) findViewById(R.id.lightBlue);
        mdarkBlue = (ImageButton) findViewById(R.id.darkBlue);
        mlightPurple = (ImageButton) findViewById(R.id.lightPurple);
        mdarkPurple = (ImageButton) findViewById(R.id.darkPurple);
        mbaskerville = (ImageButton) findViewById(R.id.baskerville);
        mfranklingothic = (ImageButton) findViewById(R.id.franklingothic);
        mgeorgia = (ImageButton) findViewById(R.id.georgia);
        mhelvetica = (ImageButton) findViewById(R.id.helvetica);
        mneutra = (ImageButton) findViewById(R.id.neutra);
        mcircle = (ImageButton) findViewById(R.id.circle);
        mhexagon = (ImageButton) findViewById(R.id.hexagon);
        mslantedlines = (ImageButton) findViewById(R.id.slantedlines);
        msquare = (ImageButton) findViewById(R.id.square);
        mtriangle = (ImageButton) findViewById(R.id.triangle);
        mcancel = (ImageButton) findViewById(R.id.cancel);

        mlightRed.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 1.5;

            }
        });

        mdarkRed.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 0.5;
            }
        });

        mlightYellow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 2.5;
            }
        });

        mdarkYellow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 1.0;
            }
        });

        mlightGreen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 3.5;
            }
        });

        mdarkGreen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 2.0;
            }
        });

        mlightBlue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 4.5;
            }
        });

        mdarkBlue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 3.0;
            }
        });

        mlightPurple.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 5.0;
            }
        });

        mdarkPurple.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 4.0;
            }
        });

        mbaskerville.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        mfranklingothic.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                font = 2.0;
            }
        });

        mgeorgia.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                font = 3.0;
            }
        });

        mhelvetica.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                font = 5.0;
            }
        });

        mneutra.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                font = 1.0;
            }
        });

        mcircle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                shape = 5.0;
            }
        });

        mhexagon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                shape = 3.0;
            }
        });

        mslantedlines.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                shape = 2.0;
            }
        });

        msquare.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                shape = 4.0;
            }
        });

        mtriangle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                shape = 1.0;
            }
        });

        mcancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 2.0;
                Intent intent = new Intent(travelMode.this, checkYourself.class);
                startActivity(intent);
            }
        });



        //Double score = Util.scoreCalc(color, font, shape);

    }
}
