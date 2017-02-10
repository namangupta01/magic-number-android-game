package com.example.rcss.magicnumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 1,total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setImageYes(View view){
        ImageView img = (ImageView) findViewById(R.id.image);

        if(counter ==1){
            img.setImageResource(R.drawable.two);
            total = total+1;
        }
        else if(counter ==2){
            img.setImageResource(R.drawable.three);
            total = total+2;
        }
        else if(counter ==3){
            img.setImageResource(R.drawable.four);
            total = total+4;
        }
        else if(counter ==4) {
            img.setImageResource(R.drawable.five);
            total = total + 8;
        }
        else if(counter ==5) {
            img.setImageResource(R.drawable.six);
            total = total + 16;
        }
        else
        {
            total = total + 32;
            TextView txt = (TextView) findViewById(R.id.text);
            txt.setText("Your Number is " + total);

        }
        counter++;

    }

    public void setImageNo(View view){
        ImageView img = (ImageView) findViewById(R.id.image);

        if(counter ==1){
            img.setImageResource(R.drawable.two);
        }
        else if(counter ==2){
            img.setImageResource(R.drawable.three);

        }
        else if(counter ==3){
            img.setImageResource(R.drawable.four);

        }
        else if(counter ==4) {
            img.setImageResource(R.drawable.five);

        }
        else if(counter ==5) {
            img.setImageResource(R.drawable.six);

        }
        else
        {
            TextView txt = (TextView) findViewById(R.id.text);
            txt.setText("Your Number is " + total);

        }
        counter++;

    }
    public void resetIt(View view){
        counter = 1;
        total = 0;
        ImageView img = (ImageView) findViewById(R.id.image);
        img.setImageResource(R.drawable.one);
        TextView txt = (TextView) findViewById(R.id.text);
        txt.setText("Is Your Number Present ?");

    }





}
