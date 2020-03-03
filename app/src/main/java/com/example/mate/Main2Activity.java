package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import com.jjoe64.graphview.GraphView;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //recuperar datos
        String dr1 = getIntent().getStringExtra("r1");
        String di1 = getIntent().getStringExtra("i1");
        String dr2 = getIntent().getStringExtra("r2");
        String di2 = getIntent().getStringExtra("i2");

        //casteo
        int dar1 = Integer.parseInt(dr1);
        int dai1 = Integer.parseInt(di1);
        int dar2 = Integer.parseInt(dr2);
        int dai2 = Integer.parseInt(di2);

       //variable 1
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(dar1, dai1),


        });
        //escalable y que se deslize la wea
        graph.addSeries(series);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-150);
        graph.getViewport().setMaxY(150);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(-150);
        graph.getViewport().setMaxX(150);
        graph.getViewport().setScrollable(true); // enables horizontal scrolling
        graph.getViewport().setScrollableY(true);

        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);

        // Variable 2
        GraphView graphi = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> seriess = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(dar2, dai2),

        });

        //resultado
        GraphView graphii = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> seriesss = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(3, 7),

        });
        graphii.addSeries(seriesss);
        graphi.addSeries(seriess);

        //var1
        series.setThickness(5);
        series.setColor(Color.rgb(210, 63, 31 ));
        series.setAnimated(true);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(5);
        series.setDrawBackground(false);
        //var2
        seriess.setThickness(5);
        seriess.setColor(Color.rgb(41, 214, 52  ));
        seriess.setAnimated(true);
        seriess.setDrawDataPoints(true);
        seriess.setDataPointsRadius(5);
        seriess.setDrawBackground(false);
        //var3
        seriess.setThickness(5);
        seriess.setColor(Color.rgb(214, 41, 207 ));
        seriess.setAnimated(true);
        seriess.setDrawDataPoints(true);
        seriess.setDataPointsRadius(5);
        seriess.setDrawBackground(false);
    }
}
