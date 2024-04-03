package com.example.projectcollection;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CalculatorExercise extends AppCompatActivity {

    TextView solution, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);

        solution = findViewById(R.id.solution_text);
        result = findViewById(R.id.result_text);

    }

    private void updateText(String strToAdd){
        String oldStr = solution.getText().toString();
        solution.setText(String.format("%s%s", oldStr, strToAdd));
        String current = oldStr + strToAdd;

        Calculations cl = new Calculations();

        if(cl.isValidEquation(current)) {
            Calculations calc = new Calculations(current);

            double res = calc.solCalculate();
            String str = String.valueOf(res);
            result.setText(str);
        }
    }

    public void zeroBTN(View view){
        updateText("0");
    }

    public void oneBTN(View view){
        updateText("1");
    }

    public void twoBTN(View view){
        updateText("2");
    }

    public void threeBTN(View view){
        updateText("3");
    }

    public void fourBTN(View view){
        updateText("4");
    }

    public void fiveBTN(View view){
        updateText("5");
    }

    public void sixBTN(View view){
        updateText("6");
    }

    public void sevenBTN(View view){
        updateText("7");
    }

    public void eightBTN(View view){
        updateText("8");
    }

    public void nineBTN(View view){
        updateText("9");
    }

    public void plusBTN(View view){
        updateText("+");
    }

    public void subtBTN(View view){
        updateText("-");
    }

    public void multBTN(View view){
        updateText("*");
    }

    public void divBTN(View view){
        updateText("/");
    }

    public void dotBTN(View view){
        updateText(".");
    }

    public void equalBTN(View view){

        Calculations cl = new Calculations();

        if(cl.isValidEquation(solution.getText().toString())) {
            Calculations calc = new Calculations(solution.getText().toString());

            double res = calc.resCalculate();
            String str = String.valueOf(res);
            result.setText(str);
        }

    }

}

