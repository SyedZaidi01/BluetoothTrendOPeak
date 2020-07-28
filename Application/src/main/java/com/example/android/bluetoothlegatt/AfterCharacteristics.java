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

        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(0);
        graphView.getViewport().setMaxX(dataArray.size());

        graphView.getViewport().setScalable(true);
        graphView.getViewport().setScalableY(true);


        DataPoint[] dataPoints = new DataPoint[dataArray.size()];

        System.out.println(dataArray+"dataArray");

        for ( int i = 0; i < dataArray.size(); i++){
            dataPoints[i] = new DataPoint(i ,Integer.parseInt(dataArray.get(i)));
        }

        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>( dataPoints);

        graphView.addSeries(series);




    }

}