package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent caller = getIntent();
        float rating = caller.getFloatExtra("nbStars",0);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Thankyou for your Feedback! Your rating is : "+rating);
    }
}