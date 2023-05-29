package com.example.alcarde_wagecalc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextHourlyWage;
    private EditText editTextHoursWorked;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextHourlyWage = findViewById(R.id.editTextHourlyWage);
        editTextHoursWorked = findViewById(R.id.editTextHoursWorked);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);


        buttonCalculate.setOnClickListener(v -> calculateWage());
    }

    @SuppressLint("SetTextI18n")
    private void calculateWage() {

        String wageString = editTextHourlyWage.getText().toString();
        String hoursString = editTextHoursWorked.getText().toString();


        double hourlyWage = Double.parseDouble(wageString);
        double hoursWorked = Double.parseDouble(hoursString);


        double totalWage = hourlyWage * hoursWorked;


        textViewResult.setText("Total Wage: $" + totalWage);
    }
}