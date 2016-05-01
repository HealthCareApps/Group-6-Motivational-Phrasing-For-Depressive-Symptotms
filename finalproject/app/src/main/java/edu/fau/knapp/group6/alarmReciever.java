package edu.fau.knapp.group6;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class alarmReciever extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("We are in the receiver!", "Yay");

        Intent service_intent = new Intent(context, RingTonePlayingService.class);

        //start ringtone service
        context.startService(service_intent);
    }
}
