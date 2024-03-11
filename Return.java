package com.example.projectcollection;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Return extends AppCompatActivity {
    Button rtnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return);


        rtnbtn = (Button) findViewById(R.id.retbutton);

        rtnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {
                Intent intent4 = new Intent(
                        Return.this, ButtonExercise.class
                );
                startActivity(intent4);
            }
        });
    }
}
