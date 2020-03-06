package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import java.math.*;

public class MainActivity extends AppCompatActivity {

    private EditText etnr1;
    private EditText etni1;
    private EditText etnr2;
    private EditText etni2;
    private TextView tvres;
    private TextView polres;
    private TextView eulres;
    private float drr1;
    private float dri2;
    private float fpr;
    private float fpi;

    private float aux1;
    private float aux2;
    private float aux3;
    private float aux4;
    private float aux5;


    //Casteo de los componentes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnr1=(EditText)findViewById(R.id.text_num_1_re);
        etni1=(EditText)findViewById(R.id.txt_num_1_im);
        etnr2=(EditText)findViewById(R.id.txt_num_2_re);
        etni2=(EditText)findViewById(R.id.txt_num_2_im);
        tvres=(TextView)findViewById(R.id.resultado);
        polres=(TextView)findViewById(R.id.textView8);
        eulres=(TextView)findViewById(R.id.textView9);




        Button btn = findViewById(R.id.ver_gra);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent intent = new Intent(v.getContext(), Main2Activity.class);
                                       //pasar datos
                                       intent.putExtra("r1",etnr1.getText().toString());
                                       intent.putExtra("i1",etni1.getText().toString());
                                       intent.putExtra("r2",etnr2.getText().toString());
                                       intent.putExtra("i2",etni2.getText().toString());
                                       intent.putExtra("vrr",drr1);
                                       intent.putExtra("vri",dri2);



                                       startActivityForResult(intent, 0);

                                   }
                               });

        ImageButton ayuda= findViewById(R.id.boton);
        ayuda.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v) {
                                         Intent intento = new Intent(v.getContext(), Main3Activity.class);
                                         startActivityForResult(intento, 0);
        }});
    }




    //metodo de suma
    public void Sumar (View res){

        String vr1=etnr1.getText().toString();
        String vi1=etni1.getText().toString();
        String vr2=etnr2.getText().toString();
        String vi2=etni2.getText().toString();
        if(TextUtils.isEmpty(vr1)) {
            etnr1.setError("No puedes dejar campos vacios");
            return;
        }
        if(TextUtils.isEmpty(vr2)) {
            etnr2.setError("No puedes dejar campos vacios");
            return;
        }
        if(TextUtils.isEmpty(vi1)) {
            etni1.setError("No puedes dejar campos vacios");
            return;
        }
        if(TextUtils.isEmpty(vi2)) {
            etni2.setError("No puedes dejar campos vacios");
            return;
        }

        float r1=Float.parseFloat(vr1);
        float i1=Float.parseFloat(vi1);
        float r2=Float.parseFloat(vr2);
        float i2=Float.parseFloat(vi2);

        final float sumare= r1 + r2;
        final float sumaim= i1 + i2;

        if(sumaim<0)
        {
            String resu= sumare + " " + sumaim +"i";
            tvres.setText(resu);
        }
        else
        {
            String resu= sumare + "+" + sumaim +"i";
            tvres.setText(resu);
        }
        drr1=sumare;
        dri2=sumaim;

        aux1=drr1*drr1;
        aux2=dri2*dri2;
        aux3=dri2/drr1;
        fpr= (float) Math.sqrt(aux1+aux2);
        fpi= (float) Math.atan(aux3);
        aux4=(float)Math.toDegrees(fpi);



        String pol=fpr+"(cos("+aux4+")+sen("+aux4+"))";
        polres.setText(pol);

        String eul=fpr+"e^(i."+aux4+")";
        eulres.setText(eul);





    }
    //metodo de resta
    public void Restar (View res) {

        String vr1 = etnr1.getText().toString();
        String vi1 = etni1.getText().toString();
        String vr2 = etnr2.getText().toString();
        String vi2 = etni2.getText().toString();

        float r1 = Integer.parseInt(vr1);
        float i1 = Integer.parseInt(vi1);
        float r2 = Integer.parseInt(vr2);
        float i2 = Integer.parseInt(vi2);

        float sumares = r1 - r2;
        float sumaima = i1 - i2;

        if (sumaima < 0) {
            String resu = sumares + " " + sumaima + "i";
            tvres.setText(resu);
        } else {
            String resu = sumares + "+" + sumaima + "i";
            tvres.setText(resu);
        }
        drr1= sumares;
        dri2=sumaima;

        aux1=drr1*drr1;
        aux2=dri2*dri2;
        aux3=dri2/drr1;
        fpr= (float) Math.sqrt(aux1+aux2);
        fpi= (float) Math.atan(aux3);
        aux4=(float)Math.toDegrees(fpi);



        String pol=fpr+"(cos("+aux4+")+sen("+aux4+"))";
        polres.setText(pol);

        String eul=fpr+"e^(i."+aux4+")";
        eulres.setText(eul);

    }

    //metodo de Dividir
    public void Dividir (View res){

        String vr1=etnr1.getText().toString();
        String vi1=etni1.getText().toString();
        String vr2=etnr2.getText().toString();
        String vi2=etni2.getText().toString();

        float r1=Integer.parseInt(vr1);
        float i1=Integer.parseInt(vi1);
        float r2=Integer.parseInt(vr2);
        float i2=Integer.parseInt(vi2);

        float inv= i2 * -1;
        float ac=r1 * r2;
        float ad=r1 * inv;
        float bc=r2 * i1;
        float bd=i1 * inv;
        float da=r2 * r2;
        float db=inv * inv;

        float suma=ac + (bd*-1);
        float sumb= ad + bc;
        float sumdiv=db + da;

        if(sumb<0)
        {
            String resu= "("+suma + " " + sumb +"i)/"+ sumdiv;

            tvres.setText(resu);
        }
        else
        {
            String resu= "("+suma + "+" + sumb +"i)/"+ sumdiv;

            tvres.setText(resu);
        }


        drr1= suma/sumdiv;
        dri2=sumb/sumdiv;

        aux1=drr1*drr1;
        aux2=dri2*dri2;
        aux3=dri2/drr1;
        fpr= (float) Math.sqrt(aux1+aux2);
        fpi= (float) Math.atan(aux3);
        aux4=(float)Math.toDegrees(fpi);



        String pol=fpr+"(cos("+aux4+")+sen("+aux4+"))";
        polres.setText(pol);

        String eul=fpr+"e^(i."+aux4+")";
        eulres.setText(eul);

    }
    //metodo multiplicar
    public void Multiplicar(View res){
        String vr1=etnr1.getText().toString();
        String vi1=etni1.getText().toString();
        String vr2=etnr2.getText().toString();
        String vi2=etni2.getText().toString();

        float r1=Integer.parseInt(vr1);
        float i1=Integer.parseInt(vi1);
        float r2=Integer.parseInt(vr2);
        float i2=Integer.parseInt(vi2);

        float ac=r1 * r2;
        float ad=r1 * i2;
        float bc=r2 * i1;
        float bd=i1 * i2;

        float suma=ac + (bd*-1);
        float sumb= ad + bc;

        if(sumb<0)
        {
            String resu= +suma + " " + sumb +"i";

            tvres.setText(resu);
        }
        else
        {
            String resu= suma + "+" + sumb +"i";

            tvres.setText(resu);
        }
        drr1=suma;
        dri2=sumb;

        aux1=drr1*drr1;
        aux2=dri2*dri2;
        aux3=dri2/drr1;
        fpr= (float) Math.sqrt(aux1+aux2);
        fpi= (float) Math.atan(aux3);
        aux4=(float)Math.toDegrees(fpi);



        String pol=fpr+"(cos("+aux4+")+sen("+aux4+"))";
        polres.setText(pol);

        String eul=fpr+"e^(i."+aux4+")";
        eulres.setText(eul);

    }



}
