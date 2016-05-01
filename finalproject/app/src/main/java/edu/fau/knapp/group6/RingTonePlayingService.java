package edu.fau.knapp.group6;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;


public class RingTonePlayingService extends Service {

    MediaPlayer mediaSong;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("LocalService", "Received start id " + startId + ": " + intent);

        mediaSong = MediaPlayer.create(this, R.raw.b);
        mediaSong.start();
        mediaSong.isPlaying();

        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {

        Toast.makeText(this, "on Destroyed called", Toast.LENGTH_SHORT).show();
    }



}