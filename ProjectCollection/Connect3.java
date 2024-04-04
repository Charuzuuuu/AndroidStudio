package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Connect3 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25;
    Button start, reset;

    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);

        btn1 = (Button) findViewById(R.id.cell1);
        btn2 = (Button) findViewById(R.id.cell2);
        btn3 = (Button) findViewById(R.id.cell3);
        btn4 = (Button) findViewById(R.id.cell4);
        btn5 = (Button) findViewById(R.id.cell5);
        btn6 = (Button) findViewById(R.id.cell6);
        btn7 = (Button) findViewById(R.id.cell7);
        btn8 = (Button) findViewById(R.id.cell8);
        btn9 = (Button) findViewById(R.id.cell9);
        btn10 = (Button) findViewById(R.id.cell10);
        btn11 = (Button) findViewById(R.id.cell11);
        btn12 = (Button) findViewById(R.id.cell12);
        btn13 = (Button) findViewById(R.id.cell13);
        btn14 = (Button) findViewById(R.id.cell14);
        btn15 = (Button) findViewById(R.id.cell15);
        btn16 = (Button) findViewById(R.id.cell16);
        btn17 = (Button) findViewById(R.id.cell17);
        btn18 = (Button) findViewById(R.id.cell18);
        btn19 = (Button) findViewById(R.id.cell19);
        btn20 = (Button) findViewById(R.id.cell20);
        btn21 = (Button) findViewById(R.id.cell21);
        btn22 = (Button) findViewById(R.id.cell22);
        btn23 = (Button) findViewById(R.id.cell23);
        btn24 = (Button) findViewById(R.id.cell24);
        btn25 = (Button) findViewById(R.id.cell25);
        start = (Button) findViewById(R.id.startbtn);
        reset = (Button) findViewById(R.id.resetbtn);
        message = findViewById(R.id.display);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                if(message.getText().toString().equals("Start a Game?")){
                    message.setText("1. Yellow Player turns");
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                if(!message.getText().toString().equals("Start a Game?") && message.getText().toString().equals("1. Yellow Player turns")) {
                        btn21.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FCDC2A")));
                        message.setText("2. Red Player turns");
                    }else if(message.getText().toString().equals("2. Red Player turns")) {
                    btn16.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#E72929")));
                    message.setText("1. Yellow Player turns");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                if(!message.getText().toString().equals("Start a Game?") && message.getText().toString().equals("1. Yellow Player turns")) {
                    btn22.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FCDC2A")));
                    message.setText("2. Red Player turns");
                }else if(message.getText().toString().equals("2. Red Player turns")) {
                    btn17.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#E72929")));
                    message.setText("1. Yellow Player turns");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                if(!message.getText().toString().equals("Start a Game?") && message.getText().toString().equals("1. Yellow Player turns")) {
                    btn23.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FCDC2A")));
                    message.setText("2. Red Player turns");
                }else if(message.getText().toString().equals("2. Red Player turns")) {
                    btn18.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#E72929")));
                    message.setText("1. Yellow Player turns");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {
                if(!message.getText().toString().equals("Start a Game?") && message.getText().toString().equals("1. Yellow Player turns")) {
                    btn24.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FCDC2A")));
                    message.setText("2. Red Player turns");
                }else if(message.getText().toString().equals("2. Red Player turns")) {
                    btn19.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#E72929")));
                    message.setText("1. Yellow Player turns");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {
                if(!message.getText().toString().equals("Start a Game?") && message.getText().toString().equals("1. Yellow Player turns")) {
                    btn25.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FCDC2A")));
                    message.setText("2. Red Player turns");
                }else if(message.getText().toString().equals("2. Red Player turns")) {
                    btn20.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#E72929")));
                    message.setText("1. Yellow Player turns");
                }
            }
        });






    }


}
