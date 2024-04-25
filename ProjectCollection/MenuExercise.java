package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    Button btnChanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.mItemChange){
            Toast.makeText(this, "Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.mItemReset){
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            btnChanger.setBackgroundTintList(getColorStateList(R.color.black));
            btnChanger.setText("Sample Text");
            btnChanger.setTextColor(getColorStateList(R.color.white));
            btnChanger.setVisibility(View.VISIBLE);
        }else if(item.getItemId() == R.id.mItemExit){
            finish();
        }

        if(item.getItemId() == R.id.mChangeBackgroundColor){
            btnChanger.setBackgroundTintList(getColorStateList(R.color.red));
        }
        if(item.getItemId() == R.id.mChangeText){
            btnChanger.setText("I Changed");
        }
        if(item.getItemId() == R.id.mChangeTextColor){
            btnChanger.setTextColor(getColorStateList(R.color.yellow));
        }
        if(item.getItemId() == R.id.mToast){
            Toast.makeText(this, "YOU CLICKED ME, YEAH YOU CLICKED ME", Toast.LENGTH_LONG).show();
        }
        if(item.getItemId() == R.id.mInvisible){
            btnChanger.setVisibility(View.INVISIBLE);
        }

        return true;
    }


}
