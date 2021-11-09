package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.model.Person;
import com.google.gson.Gson;

public class Bmi extends AppCompatActivity {
    private EditText editheight ;
    private EditText editweight ;
    private TextView name;
    private TextView result ;
    private TextView type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        editheight = findViewById(R.id.editheight);
        editweight = findViewById(R.id.editweight);
        name = findViewById(R.id.editName);
        result =findViewById(R.id.result) ;
        type =findViewById(R.id.type);
    }
    public void calculateBMI(View view){


        double weight = Double.parseDouble(editweight.getText().toString());
        double height = Double.parseDouble(editheight.getText().toString());
        double bmi = weight / Math.pow((height / 100), 2);
        String str = "Hello "+name.getText().toString()+" Your BMI is:" + String.format("%.2f",bmi);
        result.setText(str);
        if (bmi < 18.5) {
            type.setText("**Underweight**\n Your weight must be between (" +String.format("%.2f",18.5*Math.pow((height / 100), 2))+" , "+String.format("%.2f",24.9*Math.pow((height / 100), 2))+")");

        } else if (bmi >= 18.5 && bmi < 25) {
            type.setText("You are a Normal Weight");
        } else if (bmi >= 25 && bmi < 30) {
            type.setText("**Overweight**\n Your weight must be between (" +String.format("%.2f",18.5*Math.pow((height / 100), 2))+" , "+String.format("%.2f",24.9*Math.pow((height / 100), 2))+")");
        } else {
            type.setText("**obese**\n Your weight must be between (" +String.format("%.2f",18.5*Math.pow((height / 100), 2))+" , "+String.format("%.2f",24.9*Math.pow((height / 100), 2))+")");

        }




    }
}