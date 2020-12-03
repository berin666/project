package com.example.spara;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splashActivity extends AppCompatActivity {
    private int timeloading=5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //set the statue to transparent
        Window window=getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        // set splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //intent to home (main activity)
                Intent home=new Intent(splashActivity.this,MainActivity.class);
                startActivity(home);
                finish();

            }
        },timeloading);
    }
}
