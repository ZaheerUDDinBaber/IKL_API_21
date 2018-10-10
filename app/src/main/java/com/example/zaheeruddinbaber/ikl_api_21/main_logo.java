package com.example.zaheeruddinbaber.ikl_api_21;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class main_logo extends AppCompatActivity {
    private int SPLASH_SCREEN_TIMEOUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent start = new Intent(main_logo.this, home.class);
                startActivity(start);
                finish();
            }
        },SPLASH_SCREEN_TIMEOUT);
    }
}
