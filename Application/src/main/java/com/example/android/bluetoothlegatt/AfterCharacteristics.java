package com.example.android.bluetoothlegatt;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class AfterCharacteristics extends AppCompatActivity {


    Handler handler = new Handler();
    Runnable r;
    GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_characteristics);


        System.out.println("Hello World");
        Intent intent = getIntent();
        ArrayList<String> dataArray = intent.getExtras().getStringArrayList("DATA_ARRAY");

        System.out.println(dataArray);

        graphView = (GraphView) findViewById(R.id.graphView);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });

        graphView.addSeries(series);


    }
}