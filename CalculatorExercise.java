package com.example.projectcollection;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import com.google.android.material.button.MaterialButton;

public class CalculatorExercise extends AppCompatActivity implements View.OnClickListener{

    TextView result, solution;
    MaterialButton buttonDiv, buttonMul, buttonSub, buttonAdd, buttonEq;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);

        result = findViewById(R.id.result_text);
        solution = findViewById(R.id.solution_text);

        assignId(buttonDiv,R.id.button_divide);
        assignId(buttonMul,R.id.button_multiply);
        assignId(buttonSub,R.id.button_minus);
        assignId(buttonAdd,R.id.button_add);
        assignId(buttonEq,R.id.button_equal);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);

    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    public void onClick(View view){
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String calculate = solution.getText().toString();

        if(buttonText.equals("=")){
            solution.setText(result.getText());
            return;
        }

        calculate = calculate + buttonText;

        solution.setText(calculate);

        String fres = getResult(calculate);

        if(!fres.equals("Err")){
            result.setText(fres);
       }
    }

    String getResult(String data){
        try{
            Context cont = Context.enter();
            cont.setOptimizationLevel(-1);
            Scriptable scpt = cont.initStandardObjects();
            String fres = cont.evaluateString(scpt, data, "Javascipt", 1, null).toString();

            if(fres.endsWith(".0")){
                fres = fres.replace(".0", "");
            }
            return fres;

        }catch (Exception e){
            return "Err";
        }
    }


}
