package com.example.mappi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //timer variable
            int DISPLAY_LENGTH = 8000;
            new Handler().postDelayed(()->{

            //create your intent service to navigate to whichever screen
            Intent splashIntent = new Intent(MainActivity.this, MapNav.class);
            startActivity(splashIntent);
            this.finish();
        },DISPLAY_LENGTH);
    }
}