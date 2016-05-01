package edu.fau.knapp.group6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

public class alarmclock extends Activity {

    private ImageButton msetalarm, mmainmenu;
//    private Switch malarmswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_clock);

        //View object references
        msetalarm = (ImageButton) findViewById(R.id.setalarm);
        mmainmenu = (ImageButton) findViewById(R.id.mainmenu);
//        malarmswitch = (Switch) findViewById(R.id.alarmswitch);

        msetalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alarmclock.this, setClock.class);
                startActivity(intent);
            }
        });

        mmainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alarmclock.this, MainActivity.class);
                startActivity(intent);
            }
        });

    //    malarmswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      //      @Override
        //    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
          //      if (isChecked) {
                    //The toggle is enabled
                    //Turns alarm on
              //  }
            //    else {
                    //The toggle is disabled
                    //Turns alarm off
               // }
           // }
       // });
    }
}
