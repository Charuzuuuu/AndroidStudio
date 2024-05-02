package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MapsExercise extends AppCompatActivity {

    Button btnmap;
    Button btnst;

    ImageButton btnview1, btnview2, btnview3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        btnmap = (Button) findViewById(R.id.buttonmap);
        btnst = (Button) findViewById(R.id.buttonst);
        btnview1 = (ImageButton) findViewById(R.id.buttonview1);
        btnview2 = (ImageButton) findViewById(R.id.buttonview2);
        btnview3 = (ImageButton) findViewById(R.id.buttonview3);

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:16.625552, 120.768937"));
                startActivity(intent);
            }
        });

        btnst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:16.625319, 120.768954"));
                startActivity(intent);
            }
        });

    }

    public void setBackgroundOnClick(View view){
        RelativeLayout rel = findViewById(R.id.relativebg);

        if(btnview1.getId() == view.getId()){
            rel.setBackgroundResource(R.drawable.mapbg11);
        }

        if(btnview2.getId() == view.getId()){
            rel.setBackgroundResource(R.drawable.mapbg22);
        }

        if(btnview3.getId() == view.getId()){
            rel.setBackgroundResource(R.drawable.mapbg55);
        }
    }
}
