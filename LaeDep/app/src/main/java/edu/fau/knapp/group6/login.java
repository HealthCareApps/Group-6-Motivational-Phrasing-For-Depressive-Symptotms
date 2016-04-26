package edu.fau.knapp.group6;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.view.View.OnClickListener;
        import android.widget.ImageButton;

public class login extends Activity {

    private ImageButton mloginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //View object references
        mloginbutton = (ImageButton) findViewById(R.id.login_button);

        mloginbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, MainActivity.class );
                startActivity(intent);
            }
        });
    }
}
