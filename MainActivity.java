package com.example.tongfong.unitconversioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerDistance,spinnerWeight,spinnerVolume;
    EditText distanceET,weightET,volumeET;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculateDistance(View view) {
        try {
            distanceET = findViewById(R.id.distanceET);
            spinnerDistance = findViewById(R.id.spinnerDistance);
            result = findViewById(R.id.ResultView);
            double figure = Double.parseDouble(distanceET.getText().toString());
            String choose = spinnerDistance.getSelectedItem().toString();

            switch (choose) {
                case "Meters":
                    result.setText("Meters = " + figure + "\nInches = " + (figure * 39.3701) + "\nFeet = " + (figure * 3.28084) +
                            "\nYards = " + (figure * 1.09361) + "\nMiles = " + (figure * 0.00062) + "\nNautical Miles = " + (figure * 0.00054));
                    break;
                case "Inches":
                    result.setText("Meters = " + (figure * 0.0254) + "\nInches = " + figure + "\nFeet = " + (figure * 0.08333) +
                            "\nYards = " + (figure * 0.02778) + "\nMiles = " + (figure * 0.00002) + "\nNautical Miles = " + (figure * 0.00001));
                    break;
                case "Feet":
                    result.setText("Meters = " + (figure * 0.3048) + "\nInches = " + (figure * 12) + "\nFeet = " + figure +
                            "\nYards = " + (figure * 0.33333) + "\nMiles = " + (figure * 0.00019) + "\nNautical Miles = " + (figure * 0.00016));
                    break;
                case "Yards":
                    result.setText("Meters = " + (figure * 0.9144) + "\nInches = " + (figure * 36) + "\nFeet = " + (figure * 3) +
                            "\nYards = " + (figure) + "\nMiles = " + (figure * 0.00057) + "\nNautical Miles = " + (figure * 0.00049));
                    break;
                case "Miles":
                    result.setText("Meters = " + (figure * 1609.34) + "\nInches = " + (figure * 63360) + "\nFeet = " + (figure * 5280) +
                            "\nYards = " + (figure * 1760) + "\nMiles = " + (figure) + "\nNautical Miles = " + (figure * 0.86898));
                    break;
                case "Nautical Miles":
                    result.setText("Meters = " + (figure * 1852) + "\nInches = " + (figure * 72913.4) + "\nFeet = " + (figure * 6076.12) +
                            "\nYards = " + (figure * 2025.37) + "\nMiles = " + (figure * 1.15078) + "\nNautical Miles = " + (figure));
                    break;
            }
        }catch (Exception e){
            Log.e("ERROR",e.toString());
            Toast.makeText(this,"Please do not leave empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void calculateWeight(View view) {
        try {
            weightET=findViewById(R.id.weightET);
            spinnerWeight=findViewById(R.id.spinnerWeight);
            result=findViewById(R.id.ResultView);
            double figure=Double.parseDouble(weightET.getText().toString());
            String choose= spinnerWeight.getSelectedItem().toString();

            switch (choose) {
                case "Kilograms":
                    result.setText("Kilograms = " + (figure) + "\nLong Tons = "+(figure * 0.001)+"\nOunces = " + (figure * 35.274)
                            + "\nPounds = " + (figure * 2.2046) +
                            "\nTroy Pounds = " + (figure * 2.6793) + "\nStones = " + (figure * 0.1575) + "\nShort Tons = " + (figure * 0.0011));
                    break;
                case "Ounces":
                    result.setText("Kilograms = " + (figure*0.0283) + "\nLong Tons = "+(figure * 0.0003)+"\nOunces = " + (figure )
                            + "\nPounds = " + (figure *0.0625) +
                            "\nTroy Pounds = " + (figure * 0.076) + "\nStones = " + (figure * 0.0045) + "\nShort Tons = " + (figure * 0.00003));
                    break;
                case "Pounds":
                    result.setText("Kilograms = " + (figure*0.4536) + "\nLong Tons = "+(figure * 0.0005)+"\nOunces = " + (figure * 16)
                            + "\nPounds = " + (figure) +
                            "\nTroy Pounds = " + (figure * 1.2153) + "\nStones = " + (figure * 0.0714) + "\nShort Tons = " + (figure * 0.0005));
                    break;
                case "Troy Pounds":
                    result.setText("Kilograms = " + (figure*0.3732) + "\nLong Tons = "+(figure * 0.0004)+"\nOunces = " + (figure * 13.165)
                            + "\nPounds = " + (figure * 0.8228) +
                            "\nTroy Pounds = " + (figure) + "\nStones = " + (figure * 0.0588) + "\nShort Tons = " + (figure * 0.0004));
                    break;
                case "Stones":
                    result.setText("Kilograms = " + (figure*6.3503) + "\nLong Tons = "+(figure * 0.0064)+"\nOunces = " + (figure * 224)
                            + "\nPounds = " + (figure * 14) +
                            "\nTroy Pounds = " + (figure * 17.014) + "\nStones = " + (figure) + "\nShort Tons = " + (figure * 0.007));
                    break;
                case "Short Tons":
                    result.setText("Kilograms = " + (figure*907.19) + "\nLong Tons = "+(figure * 0.9070)+"\nOunces = " + (figure * 3200)
                            + "\nPounds = " + (figure * 2000) +
                            "\nTroy Pounds = " + (figure * 2430.6) + "\nStones = " + (figure * 142.86) + "\nShort Tons = " + (figure));
                    break;
                case "Long Tons":
                    result.setText("Kilograms = " + (figure*1000) + "\nLong Tons = "+(figure)+"\nOunces = " + (figure * 35274)
                            + "\nPounds = " + (figure * 2204.6) +
                            "\nTroy Pounds = " + (figure * 2679.3) + "\nStones = " + (figure * 157.47) + "\nShort Tons = " + (figure * 1.1023));
                    break;

            }
        }catch (Exception e){
            Log.e("ERROR",e.toString());
            Toast.makeText(this,"Please do not leave empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void calculateVolume(View view) {
        try{
            volumeET=findViewById(R.id.volumeET);
            spinnerVolume=findViewById(R.id.spinnerVolume);
            result=findViewById(R.id.ResultView);
            double figure=Double.parseDouble(volumeET.getText().toString());
            String choose= spinnerVolume.getSelectedItem().toString();

            switch (choose) {
                case "Liters":
                    result.setText("Liters = "+(figure)+"\nFluid Ounces = "+(figure*33.824)+"\nQuarts = "+(figure*1.057)+
                            "\nGallons = "+(figure*0.2642)+"\nImperial Gallons = "+(figure*0.22));
                    break;
                case "Fluid Ounces":
                    result.setText("Liters = "+(figure*0.0296)+"\nFluid Ounces = "+(figure)+"\nQuarts = "+(figure*0.0312)+
                            "\nGallons = "+(figure*0.0078)+"\nImperial Gallons = "+(figure*0.0065));
                    break;
                case "Quarts":
                    result.setText("Liters = "+(figure*0.9461)+"\nFluid Ounces = "+(figure*32)+"\nQuarts = "+(figure)+
                            "\nGallons = "+(figure*0.25)+"\nImperial Gallons = "+(figure*0.2082));
                    break;
                case "Gallons":
                    result.setText("Liters = "+(figure*3.7843)+"\nFluid Ounces = "+(figure*128)+"\nQuarts = "+(figure*4)+
                            "\nGallons = "+(figure)+"\nImperial Gallons = "+(figure*0.8327));
                    break;
                case "Imperial Gallons":
                    result.setText("Liters = "+(figure*4.5446)+"\nFluid Ounces = "+(figure*153.72)+"\nQuarts = "+(figure*4.8036)+
                            "\nGallons = "+(figure*1.2009)+"\nImperial Gallons = "+(figure));
                    break;
            }
        }catch (Exception e){
            Log.e("ERROR",e.toString());
            Toast.makeText(this,"Please do not leave empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetVolume(View view) {
        volumeET=findViewById(R.id.volumeET);
        volumeET.setText("");
    }

    public void resetWeight(View view) {
        weightET=findViewById(R.id.weightET);
        weightET.setText("");
    }

    public void resetDistance(View view) {
        distanceET=findViewById(R.id.distanceET);
        distanceET.setText("");
    }
}