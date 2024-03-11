package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {

    Button changebtnbg;
    Button disbtn;
    Button changebg;
    Button btntoast;
    Button btnclose;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        ConstraintLayout root = findViewById(R.id.root);

        changebtnbg = (Button) findViewById(R.id.btnbgbtn);
        disbtn = (Button) findViewById(R.id.disappearbtn);
        changebg = (Button) findViewById(R.id.bgbtn);
        btntoast = (Button) findViewById(R.id.toastbtn);
        btnclose = (Button) findViewById(R.id.closebtn);

        changebtnbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                changebtnbg.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF004D")));
            }
        });

        disbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                disbtn.setVisibility(View.INVISIBLE);
            }
        });

        changebg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                root.setBackgroundColor(Color.parseColor("#000000"));
            }
        });

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                Toast.makeText(ButtonExercise.this,"Hey you clicked Toast Button", Toast.LENGTH_LONG).show();
            }
        });

        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {
                Intent intent3 = new Intent(
                        ButtonExercise.this, Return.class
                );
                startActivity(intent3);
            }
        });

    }
}
