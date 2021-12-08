package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvert = (Button)findViewById(R.id.buttonConvert);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxCelsius = (EditText)findViewById(R.id.editTextCelsius);
                EditText textBoxFahrenheit = (EditText)findViewById(R.id.editTextFahrenheit);
                EditText textBoxKelvin = (EditText)findViewById(R.id.editTextKelvin);

                if(textBoxCelsius.getText().toString().isEmpty()==false){

                   double vCelsius = Double.valueOf(textBoxCelsius.getText().toString());
                   double vFahrenheit = (vCelsius*1.8) + 32;
                   double vKelvin = vCelsius +273.15;

                    DecimalFormat formatValue = new DecimalFormat("##.##");
                    textBoxFahrenheit.setText(formatValue.format(vFahrenheit));

                    DecimalFormat formatVal = new DecimalFormat("##.##");
                    textBoxKelvin.setText(formatValue.format(vKelvin));
                }
                else if(textBoxFahrenheit.getText().toString().isEmpty()==false){

                    double vFahrenheit = Double.valueOf(textBoxFahrenheit.getText().toString());
                    double vCelsius =(vFahrenheit - 32)*(5.0/9.0);
                    double vKelvin = (vFahrenheit - 32)*(5.0/9.0) +273.15;

                    DecimalFormat formatValue = new DecimalFormat("##.##");
                    textBoxCelsius.setText(formatValue.format(vCelsius));

                    DecimalFormat formatVal = new DecimalFormat("##.##");
                    textBoxKelvin.setText(formatValue.format(vKelvin));
                }
                else if(textBoxKelvin.getText().toString().isEmpty()==false){

                    double vKelvin = Double.valueOf(textBoxKelvin.getText().toString());
                    double vCelsius = vKelvin - 273.15;
                    double vFahrenheit = (vKelvin - 273.15)*(1.8)+32;

                    DecimalFormat formatValue = new DecimalFormat("##.##");
                    textBoxCelsius.setText(formatValue.format(vCelsius));

                    DecimalFormat formatVal = new DecimalFormat("##.##");
                    textBoxFahrenheit.setText(formatValue.format(vFahrenheit));
                }
                else if(textBoxCelsius.getText().toString().isEmpty()==true&&textBoxFahrenheit.getText().toString().isEmpty()==true&&textBoxKelvin.getText().toString().isEmpty()==true){
                    Toast.makeText(getApplicationContext(),"Enter any value",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void rate(View v){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public  void more (View v){
      Intent goToThird =new Intent(this,MainActivity4.class);
      startActivity(goToThird);
    }
}