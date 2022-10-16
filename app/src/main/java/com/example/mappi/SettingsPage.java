package com.example.mappi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
    }
    public void Exit (View view){
        Intent intent = new Intent(SettingsPage.this, MapNav.class);
        startActivity(intent);
    }
}