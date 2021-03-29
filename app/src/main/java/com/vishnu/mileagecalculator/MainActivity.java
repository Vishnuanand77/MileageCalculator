package com.vishnu.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initializations
    TextView DisplayKPL;
    EditText KMsBeforeFuelFill, KMsRunTillFuelEmpties, AmountOfFuelFilled;
    Button CalculateMileage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView to display result
        DisplayKPL = findViewById(R.id.DisplayKpl);

        //EditText fields to enter information needed to calculate
        KMsBeforeFuelFill = findViewById(R.id.KilometersRun);
        KMsRunTillFuelEmpties = findViewById(R.id.DifferenceKms);
        AmountOfFuelFilled = findViewById(R.id.FuelInput);

        //Button to enable calculation
        CalculateMileage = findViewById(R.id.CalculateBtn);


    }
}