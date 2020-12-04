package com.example.let;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    startActivities(new Intent[]{new Intent(MainActivity.this, draw.class)});
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
