package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void findSum(View view) {

        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView errText = findViewById(R.id.errorText);
        try{
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;
            numberSumTV.setText("" + sum);
            errText.setText(" ");
        }
        catch(Exception e){
            errText.setText("Must enter a number");
        }



    }

    public void findProduct(View view)  {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProductTv = findViewById(R.id.resultTV);
        TextView errText = findViewById(R.id.errorText);
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int product = num1 * num2;
            numberProductTv.setText("" + product);
            errText.setText(" ");
        }
        catch(Exception e){
            errText.setText("Must enter a number");
        }


    }

    public void findDifference(View view)  {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDiffTV = findViewById(R.id.resultTV);
        TextView errText = findViewById(R.id.errorText);
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int difference = num1 - num2;

            numberDiffTV.setText("" + difference);
            errText.setText(" ");
        }
        catch(Exception e){
            errText.setText("Must enter a number");
        }

    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuoTV = findViewById(R.id.resultTV);
        TextView errText = findViewById(R.id.errorText);
        try{
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int quotient = num1/num2;

            numberQuoTV.setText("" + quotient);
            errText.setText(" ");
        }
        catch(Exception e){
            errText.setText("Must enter a number");
        }

    }

    public void findSquare(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSquareTV = findViewById(R.id.resultTV);
        TextView errText = findViewById(R.id.errorText);
        try{
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int square = num1 * num1;
            number2ET.setText("" + num1);
            numberSquareTV.setText("" + square);
            errText.setText(" ");
        }
        catch(Exception e){
            errText.setText("Must enter a number");
        }

    }
}