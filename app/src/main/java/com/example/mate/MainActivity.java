package com.example.mate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etnr1;
    private EditText etni1;
    private EditText etnr2;
    private EditText etni2;
    private TextView tvres;


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


        ImageButton btn = findViewById(R.id.boton);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent intent = new Intent(v.getContext(), Main2Activity.class);
                                       //pasar datos
                                       intent.putExtra("r1",etnr1.getText().toString());
                                       intent.putExtra("i1",etni1.getText().toString());
                                       intent.putExtra("r2",etnr2.getText().toString());
                                       intent.putExtra("i2",etni2.getText().toString());


                                       startActivityForResult(intent, 0);

                                   }
                               });
    }




    //metodo de suma
    public void Sumar (View res){

        String vr1=etnr1.getText().toString();
        String vi1=etni1.getText().toString();
        String vr2=etnr2.getText().toString();
        String vi2=etni2.getText().toString();

        int r1=Integer.parseInt(vr1);
        int i1=Integer.parseInt(vi1);
        int r2=Integer.parseInt(vr2);
        int i2=Integer.parseInt(vi2);

        int sumare= r1 + r2;
        int sumaim= i1 + i2;

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




    }
    //metodo de resta
    public void Restar (View res) {

        String vr1 = etnr1.getText().toString();
        String vi1 = etni1.getText().toString();
        String vr2 = etnr2.getText().toString();
        String vi2 = etni2.getText().toString();

        int r1 = Integer.parseInt(vr1);
        int i1 = Integer.parseInt(vi1);
        int r2 = Integer.parseInt(vr2);
        int i2 = Integer.parseInt(vi2);

        int sumare = r1 - r2;
        int sumaim = i1 - i2;

        if (sumaim < 0) {
            String resu = sumare + " " + sumaim + "i";
            tvres.setText(resu);
        } else {
            String resu = sumare + "+" + sumaim + "i";
            tvres.setText(resu);
        }
    }

    //metodo de Dividir
    public void Dividir (View res){

        String vr1=etnr1.getText().toString();
        String vi1=etni1.getText().toString();
        String vr2=etnr2.getText().toString();
        String vi2=etni2.getText().toString();

        int r1=Integer.parseInt(vr1);
        int i1=Integer.parseInt(vi1);
        int r2=Integer.parseInt(vr2);
        int i2=Integer.parseInt(vi2);

        int inv= i2 * -1;
        int ac=r1 * r2;
        int ad=r1 * inv;
        int bc=r2 * i1;
        int bd=i1 * inv;
        int da=r2 * r2;
        int db=inv * inv;

        int suma=ac + (bd*-1);
        int sumb= ad + bc;
        int sumdiv=db + da;

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



    }
    //metodo multiplicar
    public void Multiplicar(View res){
        String vr1=etnr1.getText().toString();
        String vi1=etni1.getText().toString();
        String vr2=etnr2.getText().toString();
        String vi2=etni2.getText().toString();

        int r1=Integer.parseInt(vr1);
        int i1=Integer.parseInt(vi1);
        int r2=Integer.parseInt(vr2);
        int i2=Integer.parseInt(vi2);

        int ac=r1 * r2;
        int ad=r1 * i2;
        int bc=r2 * i1;
        int bd=i1 * i2;

        int suma=ac + (bd*-1);
        int sumb= ad + bc;

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
    }
    //inverso


}
