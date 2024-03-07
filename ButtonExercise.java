package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonExercise extends AppCompatActivity {

    Button changebtnbg;
    Button disbtn;

    Button changebg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        ConstraintLayout root = findViewById(R.id.root);

        changebtnbg = (Button) findViewById(R.id.btnbgbtn);
        disbtn = (Button) findViewById(R.id.disappearbtn);
        changebg = (Button) findViewById(R.id.bgbtn);

        changebtnbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                changebtnbg.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));
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

    }
}
