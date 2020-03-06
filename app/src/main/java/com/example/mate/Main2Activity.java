//sumar
package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;

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

        float vrg= getIntent().getFloatExtra("vrr",0);
        float vig= getIntent().getFloatExtra("vri",0);



        //casteo
        float dar1 = Float.parseFloat(dr1);
        float dai1 = Float.parseFloat(di1);
        float dar2 = Float.parseFloat(dr2);
        float dai2 = Float.parseFloat(di2);

//
 TextView mostrar1;
 TextView mostrar2;
 TextView mostrar3;



        GraphView graph = (GraphView) findViewById(R.id.graph);
        GraphView graphi = (GraphView) findViewById(R.id.graph);
        GraphView graphii = (GraphView) findViewById(R.id.graph);
        mostrar1=(TextView)findViewById(R.id.textView);
        mostrar2=(TextView)findViewById(R.id.textView4);
        mostrar3=(TextView)findViewById(R.id.textView3);
        //escalable y que se deslize la wea


        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-150);
        graph.getViewport().setMaxY(150);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(-150);
        graph.getViewport().setMaxX(150);
        graph.setBackgroundColor(Color.argb(50, 198, 229, 227));
        graph.getViewport().setScrollable(true); // enables horizontal scrolling
        graph.getViewport().setScrollableY(true);

        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);





// condicionales de los cuadrantes variable 1
        if (dar1<0)
        {
            if(dai1<0)
            {
                //cuadrante 3
                //variable 1

                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                        new DataPoint(dar1, dai1),
                        new DataPoint(0, 0),
                });
                graph.addSeries(series);
                series.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                series.setAnimated(true);
                series.setDrawDataPoints(true);
                series.setDataPointsRadius(15);
                series.setDrawBackground(false);
                series.setColor(Color.rgb(214, 41, 207 ));

                String resu= dar1 + " " + dai1 +"i";
                mostrar1.setText(resu);

            }
            else
            {
                //cuadrante 2
                //variable 1

                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                        new DataPoint(dar1, dai1),
                        new DataPoint(0, 0),
                });
                graph.addSeries(series);
                series.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                series.setAnimated(true);
                series.setDrawDataPoints(true);
                series.setDataPointsRadius(15);
                series.setDrawBackground(false);
                series.setColor(Color.rgb(214, 41, 207 ));

                String resu= dar1 + "+" + dai1 +"i";
                mostrar1.setText(resu);
            }
        }
        else
        {
            if (dai1<0)
            {
                //cuadrante 4
                //variable 1

                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                        new DataPoint(0, 0),
                        new DataPoint(dar1, dai1),

                });
                graph.addSeries(series);
                series.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                series.setAnimated(true);
                series.setDrawDataPoints(true);
                series.setDataPointsRadius(15);
                series.setDrawBackground(false);
                series.setColor(Color.rgb(214, 41, 207 ));

                String resu= dar1 + " " + dai1 +"i";
                mostrar1.setText(resu);
            }
            else
            {
                //cuadante 1
                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                        new DataPoint(0, 0),
                        new DataPoint(dar1, dai1),

                });
                graph.addSeries(series);
                series.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                series.setAnimated(true);
                series.setDrawDataPoints(true);
                series.setDataPointsRadius(15);
                series.setDrawBackground(false);
                series.setColor(Color.rgb(214, 41, 207 ));

                String resu= dar1 + "+" + dai1 +"i";
                mostrar1.setText(resu);
            }
        }
        // condicionales de los cuadrantes variable 2
        if (dar2<0)
        {
            if(dai2<0)
            {
                //cuadrante 3
                LineGraphSeries<DataPoint> seriess = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(dar2, dai2),
                        new DataPoint(0, 0),


                });
                graphi.addSeries(seriess);
                seriess.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                seriess.setThickness(5);
                seriess.setColor(Color.rgb(41, 214, 52  ));
                seriess.setAnimated(true);
                seriess.setDrawDataPoints(true);
                seriess.setDataPointsRadius(15);
                seriess.setDrawBackground(false);

                String resuu= dar2 + " " + dai2 +"i";
                mostrar2.setText(resuu);
            }
            else
            {
                //cuadrante 2
                LineGraphSeries<DataPoint> seriess = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(dar2, dai2),
                        new DataPoint(0, 0),


                });
                graphi.addSeries(seriess);
                seriess.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                seriess.setThickness(5);
                seriess.setColor(Color.rgb(41, 214, 52  ));
                seriess.setAnimated(true);
                seriess.setDrawDataPoints(true);
                seriess.setDataPointsRadius(15);
                seriess.setDrawBackground(false);

                String resuu= dar2 + "+" + dai2 +"i";
                mostrar2.setText(resuu);
            }
        }
        else
        {
            if (dai2<0)
            {
                //cuadrante 4
                LineGraphSeries<DataPoint> seriess = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(0, 0),
                        new DataPoint(dar2, dai2),



                });
                graphi.addSeries(seriess);
                seriess.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                seriess.setThickness(5);
                seriess.setColor(Color.rgb(41, 214, 52  ));
                seriess.setAnimated(true);
                seriess.setDrawDataPoints(true);
                seriess.setDataPointsRadius(15);
                seriess.setDrawBackground(false);

                String resuu= dar2 + " " + dai2 +"i";
                mostrar2.setText(resuu);
            }
            else
            {
                //cuadante 1
                LineGraphSeries<DataPoint> seriess = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(0, 0),
                        new DataPoint(dar2, dai2),



                });
                graphi.addSeries(seriess);
                seriess.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });
                seriess.setThickness(5);
                seriess.setColor(Color.rgb(41, 214, 52  ));
                seriess.setAnimated(true);
                seriess.setDrawDataPoints(true);
                seriess.setDataPointsRadius(15);
                seriess.setDrawBackground(false);

                String resuu= dar2 + "+" + dai2 +"i";
                mostrar2.setText(resuu);
            }
        }
        // condicionales de los cuadrantes variable resultante
        if (vrg<0)
        {
            if(vig<0)
            {
                //cuadrante 3
                LineGraphSeries<DataPoint> seriesss = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(vrg, vig),
                        new DataPoint(0,0),


                });
                graphii.addSeries(seriesss);
                seriesss.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });

                seriesss.setThickness(5);

                seriesss.setColor(Color.argb(100,210,63,31));
                seriesss.setAnimated(true);
                seriesss.setDrawDataPoints(true);
                seriesss.setDataPointsRadius(15);
                seriesss.setDrawBackground(false);

                String resuuu= vrg + " " + vig +"i";
                mostrar3.setText(resuuu);
            }
            else
            {
                //cuadrante 2
                LineGraphSeries<DataPoint> seriesss = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(vrg, vig),
                        new DataPoint(0,0),


                });
                graphii.addSeries(seriesss);
                seriesss.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });

                seriesss.setThickness(5);

                seriesss.setColor(Color.argb(100,210,63,31));
                seriesss.setAnimated(true);
                seriesss.setDrawDataPoints(true);
                seriesss.setDataPointsRadius(15);
                seriesss.setDrawBackground(false);

                String resuuu= vrg + "+" + vig +"i";
                mostrar3.setText(resuuu);
            }
        }
        else
        {
            if (vig<0)
            {
                //cuadrante 4
                LineGraphSeries<DataPoint> seriesss = new LineGraphSeries<>(new DataPoint[] {

                        new DataPoint(0,0),
                        new DataPoint(vrg, vig),

                });
                graphii.addSeries(seriesss);
                seriesss.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });

                seriesss.setThickness(5);

                seriesss.setColor(Color.argb(100,210,63,31));
                seriesss.setAnimated(true);
                seriesss.setDrawDataPoints(true);
                seriesss.setDataPointsRadius(15);
                seriesss.setDrawBackground(false);

                String resuuu= vrg + " " + vig +"i";
                mostrar3.setText(resuuu);
            }
            else
            {
                //cuadante 1
                LineGraphSeries<DataPoint> seriesss = new LineGraphSeries<>(new DataPoint[] {

                        new DataPoint(0,0),
                        new DataPoint(vrg, vig),

                });
                graphii.addSeries(seriesss);
                seriesss.setOnDataPointTapListener(new OnDataPointTapListener() {
                    @Override
                    public void onTap(Series series, DataPointInterface dataPoint) {
                        Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
                    }
                });

                seriesss.setThickness(5);

                seriesss.setColor(Color.argb(100,210,63,31));
                seriesss.setAnimated(true);
                seriesss.setDrawDataPoints(true);
                seriesss.setDataPointsRadius(15);
                seriesss.setDrawBackground(false);

                String resuuu= vrg + "+" + vig +"i";
                mostrar3.setText(resuuu);
            }
        }





    }


}
