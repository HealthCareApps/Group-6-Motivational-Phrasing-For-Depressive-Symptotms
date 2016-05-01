package edu.fau.knapp.group6;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imagegen extends Activity {
    final Random rnd = new Random();
    private Button enterbutton;

    @Override
    protected void onCreate(
            final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.imagegen);

        final ImageView img = (ImageView) findViewById(R.id.imageView1);
        // I have 3 images named img_0 to img_2, so...
        final String str = "img_" + rnd.nextInt(2);
        img.setImageDrawable
                (
                        getResources().getDrawable(getResourceID(str, "drawable",
                                getApplicationContext()))
                );
    }

    protected final static int getResourceID
            (final String resName, final String resType, final Context ctx) {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0) {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        } else {
            return ResourceID;
        }
    }
}

