package com.vishnu.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initializations
    TextView DisplayKPL;
    EditText KMsBeforeFuelFill, KMsRunTillFuelEmpties, AmountOfFuelFilled;
    Button CalculateMileage, ResetForm;

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
        //This button should call a method from a class which would output the required result
        CalculateMileage = findViewById(R.id.CalculateBtn);
        ResetForm = findViewById(R.id.ResetBtn);


        //OnClickListener for button
        CalculateMileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String BeforeFill = KMsBeforeFuelFill.getText().toString();
                String RunAfterFill = KMsRunTillFuelEmpties.getText().toString();
                String FuelFilled = AmountOfFuelFilled.getText().toString();

                //OnClick Invoke a class
                Calculate(BeforeFill, RunAfterFill, FuelFilled);

            }
        });

        ResetForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });


    }

    public void Calculate(String BeforeFill,String RunAfterFill,String FuelFilled){

       int  beforeFill = Integer.parseInt(BeforeFill);
       int runAfterFill = Integer.parseInt(RunAfterFill);
       int fuelFilled = Integer.parseInt(FuelFilled);

       int mileage = (runAfterFill-beforeFill)/fuelFilled;

       DisplayKPL.setText(String.valueOf(mileage));
    }

    public void Reset(){
        DisplayKPL.setText("0");
        KMsBeforeFuelFill.getText().clear();
        KMsRunTillFuelEmpties.getText().clear();
        AmountOfFuelFilled.getText().clear();
    }

}