package com.example.projectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Connect3 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25;
    Button reset;

    TextView message;

    boolean enabled = true;

    ArrayList<Button> btns;

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
        reset = (Button) findViewById(R.id.resetbtn);
        message = findViewById(R.id.display);

        btns = new ArrayList<>();
        btns.add(btn1);
        btns.add(btn2);
        btns.add(btn3);
        btns.add(btn4);
        btns.add(btn5);
        btns.add(btn6);
        btns.add(btn7);
        btns.add(btn8);
        btns.add(btn9);
        btns.add(btn10);
        btns.add(btn11);
        btns.add(btn12);
        btns.add(btn13);
        btns.add(btn14);
        btns.add(btn15);
        btns.add(btn16);
        btns.add(btn17);
        btns.add(btn18);
        btns.add(btn19);
        btns.add(btn20);
        btns.add(btn21);
        btns.add(btn22);
        btns.add(btn23);
        btns.add(btn24);
        btns.add(btn25);

        btn1.setOnClickListener(view ->{
            int def1, def2, def3, def4, def5;
            String h1 = " ";
            String h2 = " ";
            String h3 = " ";
            String h4 = " ";
            String h5 = " ";
            ColorStateList b1 = btn1.getBackgroundTintList();
            ColorStateList b2 = btn2.getBackgroundTintList();
            ColorStateList b3 = btn3.getBackgroundTintList();
            ColorStateList b4 = btn4.getBackgroundTintList();
            ColorStateList b5 = btn5.getBackgroundTintList();
            if(b1 != null && b2 != null && b3 != null && b4 != null && b5 != null){
                def1 = b1.getDefaultColor();
                def2 = b2.getDefaultColor();
                def3 = b3.getDefaultColor();
                def4 = b4.getDefaultColor();
                def5 = b5.getDefaultColor();

                h1 = String.format("#%06X", (0xFFFFFF & def1));
                h2 = String.format("#%06X", (0xFFFFFF & def2));
                h3 = String.format("#%06X", (0xFFFFFF & def3));
                h4 = String.format("#%06X", (0xFFFFFF & def4));
                h5 = String.format("#%06X", (0xFFFFFF & def5));
            }
                if(enabled) {
                    if(checkDef(h5)){
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn5.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn5.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }else if(h5.equals("#FCDC2A")){
                        if (checkDef(h4)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn4.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn4.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }else if(h5.equals("#E72929")){
                        if (checkDef(h4)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn4.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn4.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }

                    if(h4.equals("#FCDC2A")){
                        if (checkDef(h3)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn3.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn3.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }else if(h4.equals("#E72929")){
                        if (checkDef(h3)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn3.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn3.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }

                    if(h3.equals("#FCDC2A")){
                        if (checkDef(h2)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn2.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn2.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }else if(h3.equals("#E72929")){
                        if (checkDef(h2)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn2.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn2.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }

                    if(h2.equals("#FCDC2A")){
                        if (checkDef(h1)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn1.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn1.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }else if(h2.equals("#E72929")){
                        if (checkDef(h1)) {
                            if (message.getText().toString().equals("Yellow's Turn")) {
                                btn1.setBackgroundTintList(getColorStateList(R.color.yellow));
                                if(winner()){
                                    message.setText("Yellow Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Red's Turn");
                                }
                            } else if (message.getText().toString().equals("Red's Turn")) {
                                btn1.setBackgroundTintList(getColorStateList(R.color.red));
                                if(winner()){
                                    message.setText("Red Wins!");
                                    enabled = false;
                                }else{
                                    message.setText("Yellow's Turn");
                                }
                            }
                        }
                    }
                }
        });
        btn6.setOnClickListener(view ->{
            int def6, def7, def8, def9, def10;
            String h6 = " ";
            String h7 = " ";
            String h8 = " ";
            String h9 = " ";
            String h10 = " ";
            ColorStateList b6 = btn6.getBackgroundTintList();
            ColorStateList b7 = btn7.getBackgroundTintList();
            ColorStateList b8 = btn8.getBackgroundTintList();
            ColorStateList b9 = btn9.getBackgroundTintList();
            ColorStateList b10 = btn10.getBackgroundTintList();
            if(b6 != null && b7 != null && b8 != null && b9 != null && b10 != null){
                def6 = b6.getDefaultColor();
                def7 = b7.getDefaultColor();
                def8 = b8.getDefaultColor();
                def9 = b9.getDefaultColor();
                def10 = b10.getDefaultColor();

                h6 = String.format("#%06X", (0xFFFFFF & def6));
                h7 = String.format("#%06X", (0xFFFFFF & def7));
                h8 = String.format("#%06X", (0xFFFFFF & def8));
                h9 = String.format("#%06X", (0xFFFFFF & def9));
                h10 = String.format("#%06X", (0xFFFFFF & def10));
            }
            if(enabled) {
                if(checkDef(h10)){
                    if (message.getText().toString().equals("Yellow's Turn")) {
                        btn10.setBackgroundTintList(getColorStateList(R.color.yellow));
                        if(winner()){
                            message.setText("Yellow Wins!");
                            enabled = false;
                        }else{
                            message.setText("Red's Turn");
                        }
                    } else if (message.getText().toString().equals("Red's Turn")) {
                        btn10.setBackgroundTintList(getColorStateList(R.color.red));
                        if(winner()){
                            message.setText("Red Wins!");
                            enabled = false;
                        }else{
                            message.setText("Yellow's Turn");
                        }
                    }
                }else if(h10.equals("#FCDC2A")){
                    if (checkDef(h9)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn9.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn9.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h10.equals("#E72929")){
                    if (checkDef(h9)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn9.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn9.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h9.equals("#FCDC2A")){
                    if (checkDef(h8)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn8.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn8.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h9.equals("#E72929")){
                    if (checkDef(h8)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn8.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn8.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h8.equals("#FCDC2A")){
                    if (checkDef(h7)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn7.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn7.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h8.equals("#E72929")){
                    if (checkDef(h7)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn7.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn7.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h7.equals("#FCDC2A")){
                    if (checkDef(h6)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn6.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn6.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h7.equals("#E72929")){
                    if (checkDef(h6)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn6.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn6.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }
            }
        });
        btn11.setOnClickListener(view ->{
            int def11, def12, def13, def14, def15;
            String h11 = " ";
            String h12 = " ";
            String h13 = " ";
            String h14 = " ";
            String h15 = " ";
            ColorStateList b11 = btn11.getBackgroundTintList();
            ColorStateList b12 = btn12.getBackgroundTintList();
            ColorStateList b13 = btn13.getBackgroundTintList();
            ColorStateList b14 = btn14.getBackgroundTintList();
            ColorStateList b15 = btn15.getBackgroundTintList();
            if(b11 != null && b12 != null && b13 != null && b14 != null && b15 != null){
                def11 = b11.getDefaultColor();
                def12 = b12.getDefaultColor();
                def13 = b13.getDefaultColor();
                def14 = b14.getDefaultColor();
                def15 = b15.getDefaultColor();

                h11 = String.format("#%06X", (0xFFFFFF & def11));
                h12 = String.format("#%06X", (0xFFFFFF & def12));
                h13 = String.format("#%06X", (0xFFFFFF & def13));
                h14 = String.format("#%06X", (0xFFFFFF & def14));
                h15 = String.format("#%06X", (0xFFFFFF & def15));
            }
            if(enabled) {
                if(checkDef(h15)){
                    if (message.getText().toString().equals("Yellow's Turn")) {
                        btn15.setBackgroundTintList(getColorStateList(R.color.yellow));
                        if(winner()){
                            message.setText("Yellow Wins!");
                            enabled = false;
                        }else{
                            message.setText("Red's Turn");
                        }
                    } else if (message.getText().toString().equals("Red's Turn")) {
                        btn15.setBackgroundTintList(getColorStateList(R.color.red));
                        if(winner()){
                            message.setText("Red Wins!");
                            enabled = false;
                        }else{
                            message.setText("Yellow's Turn");
                        }
                    }
                }else if(h15.equals("#FCDC2A")){
                    if (checkDef(h14)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn14.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn14.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h15.equals("#E72929")){
                    if (checkDef(h14)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn14.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn14.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h14.equals("#FCDC2A")){
                    if (checkDef(h13)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn13.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn13.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h14.equals("#E72929")){
                    if (checkDef(h13)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn13.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn13.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h13.equals("#FCDC2A")){
                    if (checkDef(h12)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn12.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn12.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h13.equals("#E72929")){
                    if (checkDef(h12)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn12.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn12.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h12.equals("#FCDC2A")){
                    if (checkDef(h11)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn11.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn11.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h12.equals("#E72929")){
                    if (checkDef(h11)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn11.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn11.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }
            }
        });
        btn16.setOnClickListener(view ->{
            int def16, def17, def18, def19, def20;
            String h16 = " ";
            String h17 = " ";
            String h18 = " ";
            String h19 = " ";
            String h20 = " ";
            ColorStateList b16 = btn16.getBackgroundTintList();
            ColorStateList b17 = btn17.getBackgroundTintList();
            ColorStateList b18 = btn18.getBackgroundTintList();
            ColorStateList b19 = btn19.getBackgroundTintList();
            ColorStateList b20 = btn20.getBackgroundTintList();
            if(b16 != null && b17 != null && b18 != null && b19 != null && b20 != null){
                def16 = b16.getDefaultColor();
                def17 = b17.getDefaultColor();
                def18 = b18.getDefaultColor();
                def19 = b19.getDefaultColor();
                def20 = b20.getDefaultColor();

                h16 = String.format("#%06X", (0xFFFFFF & def16));
                h17 = String.format("#%06X", (0xFFFFFF & def17));
                h18 = String.format("#%06X", (0xFFFFFF & def18));
                h19 = String.format("#%06X", (0xFFFFFF & def19));
                h20 = String.format("#%06X", (0xFFFFFF & def20));
            }
            if(enabled) {
                if(checkDef(h20)){
                    if (message.getText().toString().equals("Yellow's Turn")) {
                        btn20.setBackgroundTintList(getColorStateList(R.color.yellow));
                        if(winner()){
                            message.setText("Yellow Wins!");
                            enabled = false;
                        }else{
                            message.setText("Red's Turn");
                        }
                    } else if (message.getText().toString().equals("Red's Turn")) {
                        btn20.setBackgroundTintList(getColorStateList(R.color.red));
                        if(winner()){
                            message.setText("Red Wins!");
                            enabled = false;
                        }else{
                            message.setText("Yellow's Turn");
                        }
                    }
                }else if(h20.equals("#FCDC2A")){
                    if (checkDef(h19)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn19.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn19.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h20.equals("#E72929")){
                    if (checkDef(h19)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn19.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn19.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h19.equals("#FCDC2A")){
                    if (checkDef(h18)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn18.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn18.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h19.equals("#E72929")){
                    if (checkDef(h18)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn18.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn18.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h18.equals("#FCDC2A")){
                    if (checkDef(h17)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn17.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn17.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h18.equals("#E72929")){
                    if (checkDef(h17)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn17.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn17.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h17.equals("#FCDC2A")){
                    if (checkDef(h16)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn16.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn16.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h17.equals("#E72929")){
                    if (checkDef(h16)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn16.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn16.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }
            }
        });
        btn21.setOnClickListener(view ->{
            int def21, def22, def23, def24, def25;
            String h21 = " ";
            String h22 = " ";
            String h23 = " ";
            String h24 = " ";
            String h25 = " ";
            ColorStateList b21 = btn21.getBackgroundTintList();
            ColorStateList b22 = btn22.getBackgroundTintList();
            ColorStateList b23 = btn23.getBackgroundTintList();
            ColorStateList b24 = btn24.getBackgroundTintList();
            ColorStateList b25 = btn25.getBackgroundTintList();
            if(b21 != null && b22 != null && b23 != null && b24 != null && b25 != null){
                def21 = b21.getDefaultColor();
                def22 = b22.getDefaultColor();
                def23 = b23.getDefaultColor();
                def24 = b24.getDefaultColor();
                def25 = b25.getDefaultColor();

                h21 = String.format("#%06X", (0xFFFFFF & def21));
                h22 = String.format("#%06X", (0xFFFFFF & def22));
                h23 = String.format("#%06X", (0xFFFFFF & def23));
                h24 = String.format("#%06X", (0xFFFFFF & def24));
                h25 = String.format("#%06X", (0xFFFFFF & def25));
            }
            if(enabled) {
                if(checkDef(h25)){
                    if (message.getText().toString().equals("Yellow's Turn")) {
                        btn25.setBackgroundTintList(getColorStateList(R.color.yellow));
                        if(winner()){
                            message.setText("Yellow Wins!");
                            enabled = false;
                        }else{
                            message.setText("Red's Turn");
                        }
                    } else if (message.getText().toString().equals("Red's Turn")) {
                        btn25.setBackgroundTintList(getColorStateList(R.color.red));
                        if(winner()){
                            message.setText("Red Wins!");
                            enabled = false;
                        }else{
                            message.setText("Yellow's Turn");
                        }
                    }
                }else if(h25.equals("#FCDC2A")){
                    if (checkDef(h24)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn24.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn24.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h25.equals("#E72929")){
                    if (checkDef(h24)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn24.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn24.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h24.equals("#FCDC2A")){
                    if (checkDef(h23)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn23.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn23.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h24.equals("#E72929")){
                    if (checkDef(h23)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn23.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn23.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h23.equals("#FCDC2A")){
                    if (checkDef(h22)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn22.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn22.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h23.equals("#E72929")){
                    if (checkDef(h22)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn22.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn22.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }

                if(h22.equals("#FCDC2A")){
                    if (checkDef(h21)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn21.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn21.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }else if(h22.equals("#E72929")){
                    if (checkDef(h21)) {
                        if (message.getText().toString().equals("Yellow's Turn")) {
                            btn21.setBackgroundTintList(getColorStateList(R.color.yellow));
                            if(winner()){
                                message.setText("Yellow Wins!");
                                enabled = false;
                            }else{
                                message.setText("Red's Turn");
                            }
                        } else if (message.getText().toString().equals("Red's Turn")) {
                            btn21.setBackgroundTintList(getColorStateList(R.color.red));
                            if(winner()){
                                message.setText("Red Wins!");
                                enabled = false;
                            }else{
                                message.setText("Yellow's Turn");
                            }
                        }
                    }
                }
            }
        });

    }

    public void newGame(View view){
        message.setText("Yellow's Turn");
        enabled = true;
        for(Button b : btns){
            b.setBackgroundTintList(getColorStateList(R.color.black));
        }
    }

    public boolean checkDef(String color){
        return color.equals("#000000");
    }

    public boolean winner(){
        boolean win = false;
        ColorStateList ch1 = btn1.getBackgroundTintList();
        ColorStateList ch2 = btn2.getBackgroundTintList();
        ColorStateList ch3 = btn3.getBackgroundTintList();
        ColorStateList ch4 = btn4.getBackgroundTintList();
        ColorStateList ch5 = btn5.getBackgroundTintList();
        ColorStateList ch6 = btn6.getBackgroundTintList();
        ColorStateList ch7 = btn7.getBackgroundTintList();
        ColorStateList ch8 = btn8.getBackgroundTintList();
        ColorStateList ch9 = btn9.getBackgroundTintList();
        ColorStateList ch10 = btn10.getBackgroundTintList();
        ColorStateList ch11 = btn11.getBackgroundTintList();
        ColorStateList ch12 = btn12.getBackgroundTintList();
        ColorStateList ch13 = btn13.getBackgroundTintList();
        ColorStateList ch14 = btn14.getBackgroundTintList();
        ColorStateList ch15 = btn15.getBackgroundTintList();
        ColorStateList ch16 = btn16.getBackgroundTintList();
        ColorStateList ch17 = btn17.getBackgroundTintList();
        ColorStateList ch18 = btn18.getBackgroundTintList();
        ColorStateList ch19 = btn19.getBackgroundTintList();
        ColorStateList ch20 = btn20.getBackgroundTintList();
        ColorStateList ch21 = btn21.getBackgroundTintList();
        ColorStateList ch22 = btn22.getBackgroundTintList();
        ColorStateList ch23 = btn23.getBackgroundTintList();
        ColorStateList ch24 = btn24.getBackgroundTintList();
        ColorStateList ch25 = btn25.getBackgroundTintList();

        if(ch5 != null && ch10 != null && ch15 != null && ch20 != null && ch25 != null && ch3 != null && ch4 != null
            && ch9 != null && ch13 != null && ch8 != null && ch14 != null && ch18 != null && ch19 != null &&
            ch23 != null && ch24 != null){
            int chdef3 = ch3.getDefaultColor();
            int chdef4 = ch4.getDefaultColor();
            int chdef5 = ch5.getDefaultColor();
            int chdef8 = ch8.getDefaultColor();
            int chdef9 = ch9.getDefaultColor();
            int chdef10 = ch10.getDefaultColor();
            int chdef13 = ch13.getDefaultColor();
            int chdef14 = ch14.getDefaultColor();
            int chdef15 = ch15.getDefaultColor();
            int chdef18 = ch18.getDefaultColor();
            int chdef19 = ch19.getDefaultColor();
            int chdef20 = ch20.getDefaultColor();
            int chdef23 = ch23.getDefaultColor();
            int chdef24 = ch24.getDefaultColor();
            int chdef25 = ch25.getDefaultColor();
            String hex3 = String.format("#%06X", (0xFFFFFF & chdef3));
            String hex4 = String.format("#%06X", (0xFFFFFF & chdef4));
            String hex5 = String.format("#%06X", (0xFFFFFF & chdef5));
            String hex8 = String.format("#%06X", (0xFFFFFF & chdef8));
            String hex9 = String.format("#%06X", (0xFFFFFF & chdef9));
            String hex10 = String.format("#%06X", (0xFFFFFF & chdef10));
            String hex13 = String.format("#%06X", (0xFFFFFF & chdef13));
            String hex14 = String.format("#%06X", (0xFFFFFF & chdef14));
            String hex15 = String.format("#%06X", (0xFFFFFF & chdef15));
            String hex18 = String.format("#%06X", (0xFFFFFF & chdef18));
            String hex19 = String.format("#%06X", (0xFFFFFF & chdef19));
            String hex20 = String.format("#%06X", (0xFFFFFF & chdef20));
            String hex23 = String.format("#%06X", (0xFFFFFF & chdef23));
            String hex24 = String.format("#%06X", (0xFFFFFF & chdef24));
            String hex25 = String.format("#%06X", (0xFFFFFF & chdef25));
            if(hex5.equals("#FCDC2A") && hex10.equals("#FCDC2A") && hex15.equals("#FCDC2A")){
                win = true;
            }else if(hex5.equals("#E72929") && hex10.equals("#E72929") && hex15.equals("#E72929")){
                win = true;
            }else if(hex10.equals("#FCDC2A") && hex15.equals("#FCDC2A") && hex20.equals("#FCDC2A")){
                win = true;
            }else if(hex10.equals("#E72929") && hex15.equals("#E72929") && hex20.equals("#E72929")) {
                win = true;
            }else if(hex15.equals("#FCDC2A") && hex20.equals("#FCDC2A") && hex25.equals("#FCDC2A")){
                win = true;
            }else if(hex15.equals("#E72929") && hex20.equals("#E72929") && hex25.equals("#E72929")) {
                win = true;
            }else if(hex5.equals("#FCDC2A") && hex4.equals("#FCDC2A") && hex3.equals("#FCDC2A")) {
                win = true;
            }else if(hex5.equals("#E72929") && hex4.equals("#E72929") && hex3.equals("#E72929")){
                win = true;
            }else if(hex5.equals("#FCDC2A") && hex9.equals("#FCDC2A") && hex13.equals("#FCDC2A")) {
                win = true;
            }else if(hex5.equals("#E72929") && hex9.equals("#E72929") && hex13.equals("#E72929")){
                win = true;
            }else if(hex10.equals("#FCDC2A") && hex9.equals("#FCDC2A") && hex8.equals("#FCDC2A")){
                win = true;
            }else if(hex10.equals("#E72929") && hex9.equals("#E72929") && hex8.equals("#E72929")) {
                win = true;
            }else if(hex10.equals("#FCDC2A") && hex14.equals("#FCDC2A") && hex18.equals("#FCDC2A")){
                win = true;
            }else if(hex10.equals("#E72929") && hex14.equals("#E72929") && hex18.equals("#E72929")) {
                win = true;
            }else if(hex15.equals("#FCDC2A") && hex9.equals("#FCDC2A") && hex3.equals("#FCDC2A")){
                win = true;
            }else if(hex15.equals("#E72929") && hex9.equals("#E72929") && hex3.equals("#E72929")) {
                win = true;
            }else if(hex15.equals("#FCDC2A") && hex19.equals("#FCDC2A") && hex23.equals("#FCDC2A")){
                win = true;
            }else if(hex15.equals("#E72929") && hex19.equals("#E72929") && hex23.equals("#E72929")) {
                win = true;
            }else if(hex15.equals("#FCDC2A") && hex14.equals("#FCDC2A") && hex13.equals("#FCDC2A")){
                win = true;
            }else if(hex15.equals("#E72929") && hex14.equals("#E72929") && hex13.equals("#E72929")) {
                win = true;
            }else if(hex20.equals("#FCDC2A") && hex14.equals("#FCDC2A") && hex8.equals("#FCDC2A")){
                win = true;
            }else if(hex20.equals("#E72929") && hex14.equals("#E72929") && hex8.equals("#E72929")) {
                win = true;
            }else if(hex20.equals("#FCDC2A") && hex19.equals("#FCDC2A") && hex18.equals("#FCDC2A")){
                win = true;
            }else if(hex20.equals("#E72929") && hex19.equals("#E72929") && hex18.equals("#E72929")) {
                win = true;
            }else if(hex25.equals("#FCDC2A") && hex19.equals("#FCDC2A") && hex13.equals("#FCDC2A")){
                win = true;
            }else if(hex25.equals("#E72929") && hex19.equals("#E72929") && hex13.equals("#E72929")) {
                win = true;
            }else if(hex25.equals("#FCDC2A") && hex24.equals("#FCDC2A") && hex23.equals("#FCDC2A")){
                win = true;
            }else if(hex25.equals("#E72929") && hex24.equals("#E72929") && hex23.equals("#E72929")) {
                win = true;
            }
        }

        if(ch4 != null && ch9 != null && ch14 != null && ch19 != null && ch24 != null && ch2 != null && ch3 != null
            && ch8 != null && ch12 != null && ch7 != null && ch13 != null && ch17 != null && ch18 != null &&
            ch22 != null && ch23 != null){
            int chdef2 = ch2.getDefaultColor();
            int chdef3 = ch3.getDefaultColor();
            int chdef4 = ch4.getDefaultColor();
            int chdef7 = ch7.getDefaultColor();
            int chdef8 = ch8.getDefaultColor();
            int chdef9 = ch9.getDefaultColor();
            int chdef12 = ch12.getDefaultColor();
            int chdef13 = ch13.getDefaultColor();
            int chdef14 = ch14.getDefaultColor();
            int chdef17 = ch17.getDefaultColor();
            int chdef18 = ch18.getDefaultColor();
            int chdef19 = ch19.getDefaultColor();
            int chdef22 = ch22.getDefaultColor();
            int chdef23 = ch23.getDefaultColor();
            int chdef24 = ch24.getDefaultColor();
            String hex2 = String.format("#%06X", (0xFFFFFF & chdef2));
            String hex3 = String.format("#%06X", (0xFFFFFF & chdef3));
            String hex4 = String.format("#%06X", (0xFFFFFF & chdef4));
            String hex7 = String.format("#%06X", (0xFFFFFF & chdef7));
            String hex8 = String.format("#%06X", (0xFFFFFF & chdef8));
            String hex9 = String.format("#%06X", (0xFFFFFF & chdef9));
            String hex12 = String.format("#%06X", (0xFFFFFF & chdef12));
            String hex13 = String.format("#%06X", (0xFFFFFF & chdef13));
            String hex14 = String.format("#%06X", (0xFFFFFF & chdef14));
            String hex17 = String.format("#%06X", (0xFFFFFF & chdef17));
            String hex18 = String.format("#%06X", (0xFFFFFF & chdef18));
            String hex19 = String.format("#%06X", (0xFFFFFF & chdef19));
            String hex22 = String.format("#%06X", (0xFFFFFF & chdef22));
            String hex23 = String.format("#%06X", (0xFFFFFF & chdef23));
            String hex24 = String.format("#%06X", (0xFFFFFF & chdef24));
            if(hex4.equals("#FCDC2A") && hex9.equals("#FCDC2A") && hex14.equals("#FCDC2A")){
                win = true;
            }else if(hex4.equals("#E72929") && hex9.equals("#E72929") && hex14.equals("#E72929")){
                win = true;
            }else if(hex9.equals("#FCDC2A") && hex14.equals("#FCDC2A") && hex19.equals("#FCDC2A")){
                win = true;
            }else if(hex9.equals("#E72929") && hex14.equals("#E72929") && hex19.equals("#E72929")) {
                win = true;
            }else if(hex14.equals("#FCDC2A") && hex19.equals("#FCDC2A") && hex24.equals("#FCDC2A")){
                win = true;
            }else if(hex14.equals("#E72929") && hex19.equals("#E72929") && hex24.equals("#E72929")) {
                win = true;
            }else if(hex4.equals("#FCDC2A") && hex3.equals("#FCDC2A") && hex2.equals("#FCDC2A")){
                win = true;
            }else if(hex4.equals("#E72929") && hex3.equals("#E72929") && hex2.equals("#E72929")){
                win = true;
            }else if(hex4.equals("#FCDC2A") && hex8.equals("#FCDC2A") && hex12.equals("#FCDC2A")){
                win = true;
            }else if(hex4.equals("#E72929") && hex8.equals("#E72929") && hex12.equals("#E72929")){
                win = true;
            }else if(hex9.equals("#FCDC2A") && hex8.equals("#FCDC2A") && hex7.equals("#FCDC2A")){
                win = true;
            }else if(hex9.equals("#E72929") && hex8.equals("#E72929") && hex7.equals("#E72929")) {
                win = true;
            }else if(hex9.equals("#FCDC2A") && hex13.equals("#FCDC2A") && hex17.equals("#FCDC2A")){
                win = true;
            }else if(hex9.equals("#E72929") && hex13.equals("#E72929") && hex17.equals("#E72929")) {
                win = true;
            }else if(hex14.equals("#FCDC2A") && hex8.equals("#FCDC2A") && hex2.equals("#FCDC2A")){
                win = true;
            }else if(hex14.equals("#E72929") && hex8.equals("#E72929") && hex2.equals("#E72929")) {
                win = true;
            }else if(hex14.equals("#FCDC2A") && hex13.equals("#FCDC2A") && hex12.equals("#FCDC2A")){
                win = true;
            }else if(hex14.equals("#E72929") && hex13.equals("#E72929") && hex12.equals("#E72929")) {
                win = true;
            }else if(hex14.equals("#FCDC2A") && hex18.equals("#FCDC2A") && hex22.equals("#FCDC2A")){
                win = true;
            }else if(hex14.equals("#E72929") && hex18.equals("#E72929") && hex22.equals("#E72929")) {
                win = true;
            }else if(hex19.equals("#FCDC2A") && hex13.equals("#FCDC2A") && hex7.equals("#FCDC2A")){
                win = true;
            }else if(hex19.equals("#E72929") && hex13.equals("#E72929") && hex7.equals("#E72929")) {
                win = true;
            }else if(hex19.equals("#FCDC2A") && hex18.equals("#FCDC2A") && hex17.equals("#FCDC2A")){
                win = true;
            }else if(hex19.equals("#E72929") && hex18.equals("#E72929") && hex17.equals("#E72929")) {
                win = true;
            }else if(hex24.equals("#FCDC2A") && hex18.equals("#FCDC2A") && hex12.equals("#FCDC2A")){
                win = true;
            }else if(hex24.equals("#E72929") && hex18.equals("#E72929") && hex12.equals("#E72929")) {
                win = true;
            }else if(hex24.equals("#FCDC2A") && hex23.equals("#FCDC2A") && hex22.equals("#FCDC2A")){
                win = true;
            }else if(hex24.equals("#E72929") && hex23.equals("#E72929") && hex22.equals("#E72929")) {
                win = true;
            }
        }

        if(ch3 != null && ch8 != null && ch13 != null && ch18 != null && ch23 != null && ch1 != null && ch2 != null
            && ch7 != null && ch11 != null && ch17 != null && ch6 != null && ch12 != null && ch16 != null &&
            ch21 != null && ch22 != null){
            int chdef1 = ch1.getDefaultColor();
            int chdef2 = ch2.getDefaultColor();
            int chdef3 = ch3.getDefaultColor();
            int chdef6 = ch6.getDefaultColor();
            int chdef7 = ch7.getDefaultColor();
            int chdef8 = ch8.getDefaultColor();
            int chdef11 = ch11.getDefaultColor();
            int chdef12 = ch12.getDefaultColor();
            int chdef13 = ch13.getDefaultColor();
            int chdef16 = ch16.getDefaultColor();
            int chdef17 = ch17.getDefaultColor();
            int chdef18 = ch18.getDefaultColor();
            int chdef21 = ch21.getDefaultColor();
            int chdef22 = ch22.getDefaultColor();
            int chdef23 = ch23.getDefaultColor();
            String hex1 = String.format("#%06X", (0xFFFFFF & chdef1));
            String hex2 = String.format("#%06X", (0xFFFFFF & chdef2));
            String hex3 = String.format("#%06X", (0xFFFFFF & chdef3));
            String hex6 = String.format("#%06X", (0xFFFFFF & chdef6));
            String hex7 = String.format("#%06X", (0xFFFFFF & chdef7));
            String hex8 = String.format("#%06X", (0xFFFFFF & chdef8));
            String hex11 = String.format("#%06X", (0xFFFFFF & chdef11));
            String hex12 = String.format("#%06X", (0xFFFFFF & chdef12));
            String hex13 = String.format("#%06X", (0xFFFFFF & chdef13));
            String hex16 = String.format("#%06X", (0xFFFFFF & chdef16));
            String hex17 = String.format("#%06X", (0xFFFFFF & chdef17));
            String hex18 = String.format("#%06X", (0xFFFFFF & chdef18));
            String hex21 = String.format("#%06X", (0xFFFFFF & chdef21));
            String hex22 = String.format("#%06X", (0xFFFFFF & chdef22));
            String hex23 = String.format("#%06X", (0xFFFFFF & chdef23));
            if(hex3.equals("#FCDC2A") && hex8.equals("#FCDC2A") && hex13.equals("#FCDC2A")){
                win = true;
            }else if(hex3.equals("#E72929") && hex8.equals("#E72929") && hex13.equals("#E72929")){
                win = true;
            }else if(hex8.equals("#FCDC2A") && hex13.equals("#FCDC2A") && hex18.equals("#FCDC2A")){
                win = true;
            }else if(hex8.equals("#E72929") && hex13.equals("#E72929") && hex18.equals("#E72929")) {
                win = true;
            }else if(hex13.equals("#FCDC2A") && hex18.equals("#FCDC2A") && hex23.equals("#FCDC2A")){
                win = true;
            }else if(hex13.equals("#E72929") && hex18.equals("#E72929") && hex23.equals("#E72929")) {
                win = true;
            }else if(hex3.equals("#FCDC2A") && hex2.equals("#FCDC2A") && hex1.equals("#FCDC2A")){
                win = true;
            }else if(hex3.equals("#E72929") && hex2.equals("#E72929") && hex1.equals("#E72929")){
                win = true;
            }else if(hex3.equals("#FCDC2A") && hex7.equals("#FCDC2A") && hex11.equals("#FCDC2A")){
                win = true;
            }else if(hex3.equals("#E72929") && hex7.equals("#E72929") && hex11.equals("#E72929")) {
                win = true;
            }else if(hex8.equals("#FCDC2A") && hex7.equals("#FCDC2A") && hex6.equals("#FCDC2A")){
                win = true;
            }else if(hex8.equals("#E72929") && hex7.equals("#E72929") && hex6.equals("#E72929")) {
                win = true;
            }else if(hex8.equals("#FCDC2A") && hex12.equals("#FCDC2A") && hex16.equals("#FCDC2A")){
                win = true;
            }else if(hex8.equals("#E72929") && hex12.equals("#E72929") && hex16.equals("#E72929")) {
                win = true;
            }else if(hex13.equals("#FCDC2A") && hex7.equals("#FCDC2A") && hex1.equals("#FCDC2A")){
                win = true;
            }else if(hex13.equals("#E72929") && hex7.equals("#E72929") && hex1.equals("#E72929")) {
                win = true;
            }else if(hex13.equals("#FCDC2A") && hex12.equals("#FCDC2A") && hex11.equals("#FCDC2A")){
                win = true;
            }else if(hex13.equals("#E72929") && hex12.equals("#E72929") && hex11.equals("#E72929")) {
                win = true;
            }else if(hex13.equals("#FCDC2A") && hex17.equals("#FCDC2A") && hex21.equals("#FCDC2A")){
                win = true;
            }else if(hex13.equals("#E72929") && hex17.equals("#E72929") && hex21.equals("#E72929")) {
                win = true;
            }else if(hex18.equals("#FCDC2A") && hex12.equals("#FCDC2A") && hex6.equals("#FCDC2A")){
                win = true;
            }else if(hex18.equals("#E72929") && hex12.equals("#E72929") && hex6.equals("#E72929")) {
                win = true;
            }else if(hex18.equals("#FCDC2A") && hex17.equals("#FCDC2A") && hex16.equals("#FCDC2A")){
                win = true;
            }else if(hex18.equals("#E72929") && hex17.equals("#E72929") && hex16.equals("#E72929")) {
                win = true;
            }else if(hex23.equals("#FCDC2A") && hex17.equals("#FCDC2A") && hex11.equals("#FCDC2A")){
                win = true;
            }else if(hex23.equals("#E72929") && hex17.equals("#E72929") && hex11.equals("#E72929")) {
                win = true;
            }else if(hex23.equals("#FCDC2A") && hex22.equals("#FCDC2A") && hex21.equals("#FCDC2A")){
                win = true;
            }else if(hex23.equals("#E72929") && hex22.equals("#E72929") && hex21.equals("#E72929")) {
                win = true;
            }
        }

        if(ch2 != null && ch7 != null && ch12 != null && ch17 != null && ch22 != null){
            int chdef2 = ch2.getDefaultColor();
            int chdef7 = ch7.getDefaultColor();
            int chdef12 = ch12.getDefaultColor();
            int chdef17 = ch17.getDefaultColor();
            int chdef22 = ch22.getDefaultColor();
            String hex2 = String.format("#%06X", (0xFFFFFF & chdef2));
            String hex7 = String.format("#%06X", (0xFFFFFF & chdef7));
            String hex12 = String.format("#%06X", (0xFFFFFF & chdef12));
            String hex17 = String.format("#%06X", (0xFFFFFF & chdef17));
            String hex22 = String.format("#%06X", (0xFFFFFF & chdef22));
            if(hex2.equals("#FCDC2A") && hex7.equals("#FCDC2A") && hex12.equals("#FCDC2A")){
                win = true;
            }else if(hex2.equals("#E72929") && hex7.equals("#E72929") && hex12.equals("#E72929")){
                win = true;
            }else if(hex7.equals("#FCDC2A") && hex12.equals("#FCDC2A") && hex17.equals("#FCDC2A")){
                win = true;
            }else if(hex7.equals("#E72929") && hex12.equals("#E72929") && hex17.equals("#E72929")) {
                win = true;
            }else if(hex12.equals("#FCDC2A") && hex17.equals("#FCDC2A") && hex22.equals("#FCDC2A")){
                win = true;
            }else if(hex12.equals("#E72929") && hex17.equals("#E72929") && hex22.equals("#E72929")) {
                win = true;
            }
        }

        if(ch1 != null && ch6 != null && ch11 != null && ch16 != null && ch21 != null){
            int chdef1 = ch1.getDefaultColor();
            int chdef6 = ch6.getDefaultColor();
            int chdef11 = ch11.getDefaultColor();
            int chdef16 = ch16.getDefaultColor();
            int chdef21 = ch21.getDefaultColor();
            String hex1 = String.format("#%06X", (0xFFFFFF & chdef1));
            String hex6 = String.format("#%06X", (0xFFFFFF & chdef6));
            String hex11 = String.format("#%06X", (0xFFFFFF & chdef11));
            String hex16 = String.format("#%06X", (0xFFFFFF & chdef16));
            String hex21 = String.format("#%06X", (0xFFFFFF & chdef21));
            if(hex1.equals("#FCDC2A") && hex6.equals("#FCDC2A") && hex11.equals("#FCDC2A")){
                win = true;
            }else if(hex1.equals("#E72929") && hex6.equals("#E72929") && hex11.equals("#E72929")){
                win = true;
            }else if(hex6.equals("#FCDC2A") && hex11.equals("#FCDC2A") && hex16.equals("#FCDC2A")){
                win = true;
            }else if(hex6.equals("#E72929") && hex11.equals("#E72929") && hex16.equals("#E72929")) {
                win = true;
            }else if(hex11.equals("#FCDC2A") && hex16.equals("#FCDC2A") && hex21.equals("#FCDC2A")){
                win = true;
            }else if(hex11.equals("#E72929") && hex16.equals("#E72929") && hex21.equals("#E72929")) {
                win = true;
            }
        }

        return win;
    }

}

/* reference

        ColorStateList current = btn1.getBackgroundTintList();

        if (current != null) {
            // Get the default color (without considering any state)
            int defaultColor = current.getDefaultColor();

            // Convert the default color to hex string
            String hexColor = String.format("#%06X", (0xFFFFFF & defaultColor));
            message.setText(hexColor);
        }

 */
