package com.example.a180104067offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cure extends AppCompatActivity implements View.OnClickListener{

    TextView text1,text2,text3,text4,text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cure);


        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.text1)
        {
           text1.setVisibility(View.GONE);
           text2.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.text2)
        {
            text2.setVisibility(View.GONE);
            text3.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.text3)
        {
            text3.setVisibility(View.GONE);
            text4.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.text4)
        {
            text4.setVisibility(View.GONE);
            text5.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.text5)
        {
            Intent intent = new Intent(cure.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
