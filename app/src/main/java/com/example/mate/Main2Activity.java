//sumar
package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
        int vrg= getIntent().getIntExtra("vrr",0);
        int vig= getIntent().getIntExtra("vri",0);



        //casteo
        int dar1 = Integer.parseInt(dr1);
        int dai1 = Integer.parseInt(di1);
        int dar2 = Integer.parseInt(dr2);
        int dai2 = Integer.parseInt(di2);




        //suma
       // int sumare= dar1 + dar2;
        //int sumaim= dai1 + dai2;

        //resta
        //int sumarere= dar1 - dar2;
        //int sumaimre= dai1 - dai2;

        //multiplicación
        //int ac=dar1 * dar2;
        //int ad=dar1 * dai2;
        //int bc=dar2 * dai1;
        //int bd=dai1 * dai2;

        //int suma=ac + (bd*-1);
        //int sumb= ad + bc;

        //division
        //int inv= dai2 * -1;
        //int acd=dar1 * dar2;
        //int add=dar1 * inv;
        //int bcd=dar2 * dai1;
        //int bdd=dai1 * inv;
        //int da=dar2 * dar2;
        //int db=inv * inv;

        //int sumad=ac + (bd*-1);
        //int sumbd= ad + bc;
        //int sumdivd=db + da;
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
        graph.setBackgroundColor(Color.argb(50, 198, 229, 227));
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
// condicionales de los cuadrantes
        if (vrg<0)
        {
            if(vig<0)
            {
                //cuadrante 3
            }
            else
            {
                //cuadrante 2
            }
        }
        else
        {
            if (vig<0)
            {
                //cuadrante 4
            }
            else
            {
                //cuadante 1
            }
        }
        //resultado
        GraphView graphii = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> seriesss = new LineGraphSeries<>(new DataPoint[] {

                new DataPoint(0,0),
               new DataPoint(vrg, vig),

        });
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
            }
        });
        seriess.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
            }
        });
        seriesss.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Main2Activity.this,"Este punto está ubicado en las coordenadas"+dataPoint, Toast.LENGTH_SHORT).show();
            }
        });
        graphii.addSeries(seriesss);
        graphi.addSeries(seriess);

        //var1
        series.setThickness(5);

        series.setAnimated(true);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(5);
        series.setDrawBackground(false);
        series.setColor(Color.rgb(214, 41, 207 ));

        //var2
        seriess.setThickness(5);
        seriess.setColor(Color.rgb(41, 214, 52  ));
        seriess.setAnimated(true);
        seriess.setDrawDataPoints(true);
        seriess.setDataPointsRadius(5);
        seriess.setDrawBackground(false);
        //var3
        seriesss.setThickness(5);

        seriesss.setColor(Color.argb(80,210,63,31));
        seriesss.setAnimated(true);
        seriesss.setDrawDataPoints(true);
        seriesss.setDataPointsRadius(5);
        seriesss.setDrawBackground(false);
    }


}
