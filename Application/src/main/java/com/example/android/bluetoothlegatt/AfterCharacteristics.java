package com.example.android.bluetoothlegatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class AfterCharacteristics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_characteristics);

        Intent intent = getIntent();
        ArrayList<String> DATA_RECIEVED = intent.getStringArrayListExtra("DATA_ARRAY");
        System.out.println("DEBUGGING: In AfterCharac"+DATA_RECIEVED);
    }
}