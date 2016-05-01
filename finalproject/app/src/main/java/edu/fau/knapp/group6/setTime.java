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

public class setTime extends Activity {

    AlarmManager alarmManager;
    TimePicker timePicker;
    TextView alarmStatus;
    Context context;
    private PendingIntent pendingIntent;


    //@TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_time);

        this.context = this;

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        alarmStatus = (TextView) findViewById(R.id.Alarm_Status);
        final Calendar calendar = Calendar.getInstance();
        //PendingIntent pendingIntent;

        Button setAlarm = (Button) findViewById(R.id.Set_Alarm);
        Button turnOff = (Button) findViewById(R.id.Turn_Off);

        //create intent to reciever class
        final Intent receive = new Intent(this.context, alarmReciever.class);


        setAlarm.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getCurrentHour());
                calendar.set(Calendar.MINUTE, timePicker.getCurrentMinute());

                final int hour = timePicker.getCurrentHour();
                final int minute = timePicker.getCurrentMinute();;

                String minute_string = String.valueOf(minute);
                String hour_string = String.valueOf(hour);

                if (minute < 10) {
                    minute_string = "0" + String.valueOf(minute);
                }

                if (hour > 12) {
                    hour_string = String.valueOf(hour - 12) ;
                }


                setAlarmStatus("Alarm set to " + hour_string + ":" + minute_string);

                //impending intent that delays intent until specified alarm is to go off.
                pendingIntent = PendingIntent.getBroadcast(setTime.this, 0, receive, PendingIntent.FLAG_UPDATE_CURRENT);

                //set alarm manager
                alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);

            }
        });

        turnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlarmStatus("Alarm Off");

                //cancel alarm.
                alarmManager.cancel(pendingIntent);
            }
        });
    }
    private void setAlarmStatus(String s) {
        alarmStatus.setText(s);
    }
}
