package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView outputResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.editFirstNumber);
        secondNumber = findViewById(R.id.editSecondNumber);
        outputResult = findViewById(R.id.textSeeResult);
    }

    public void sumOfNumbers(View view) {
        String n1 = firstNumber.getText().toString();
        int num1 = Integer.parseInt(n1);
        String n2 = secondNumber.getText().toString();
        int num2 = Integer.parseInt(n2);
        int sum = num1 + num2;
        String printResult = Integer.valueOf(sum).toString();
        outputResult.setText(printResult);
    }

    public void differenceOfNumbers(View view) {
        String n1 = firstNumber.getText().toString();
        int num1 = Integer.parseInt(n1);
        String n2 = secondNumber.getText().toString();
        int num2 = Integer.parseInt(n2);
        int difference = num1 - num2;
        String printResult = Integer.valueOf(difference).toString();
        outputResult.setText(printResult);
    }

    public void multiplicationOfNumbers(View view) {
        String n1 = firstNumber.getText().toString();
        int num1 = Integer.parseInt(n1);
        String n2 = secondNumber.getText().toString();
        int num2 = Integer.parseInt(n2);
        int result = num1 * num2;
        String printResult = Integer.valueOf(result).toString();
        outputResult.setText(printResult);
    }

    public void divisionOfNumbers(View view) {
        String n1 = firstNumber.getText().toString();
        int num1 = Integer.parseInt(n1);
        String n2 = secondNumber.getText().toString();
        int num2 = Integer.parseInt(n2);
        int division = num1 / num2;
        String printResult = Integer.valueOf(division).toString();
        outputResult.setText(printResult);
    }
}