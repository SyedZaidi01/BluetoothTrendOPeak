package com.example.android.bluetoothlegatt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class AfterCharacteristics extends AppCompatActivity {


    Handler handler = new Handler();
    Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_characteristics);

        r = new Runnable() {
            public void run() {
                System.out.println("Hello World");
                Intent intent = getIntent();
                String DATA_RECIEVED = intent.getExtras().getString("DATA_ARRAY");
                System.out.println("DEBUGGING: In AfterCharac"+DATA_RECIEVED);
                handler.postDelayed(this, 1000);
            }
        };
        handler.postDelayed(r, 1000);

    }
}