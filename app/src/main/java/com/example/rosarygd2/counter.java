package com.example.rosarygd2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class counter extends AppCompatActivity {

    private int countTmp = 0;
    private int setCountTmp = 0;
    ImageView addBtn , subBtn;
    //ImageButton resetBtn;
    TextView countVal ;
    TextView setCountVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);


            countVal = (TextView) findViewById(R.id.count);
            addBtn = findViewById(R.id.adder);
            subBtn = findViewById(R.id.minus);
            //resetBtn = (ImageButton) findViewById(R.id.resetBtn);
            setCountVal = (TextView) findViewById(R.id.count2);

            addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    countTmp++;
                    countVal.setText(Integer.toString(countTmp));
                    if(countTmp == 108) {
                        setCountTmp++;
                        setCountVal.setText(Integer.toString(setCountTmp));
                        countTmp = 0;
                    }
                }
            });

            subBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    countTmp--;
                    if(countTmp < 0) {
                        setCountTmp--;
                        if(setCountTmp < 0) {
                            setCountTmp = 0;
                            countTmp = 0;
                        } else {
                            countTmp = 107;
                        }
                        setCountVal.setText(Integer.toString(setCountTmp));
                    }
                    countVal.setText(Integer.toString(countTmp));
                }
            });

//            resetBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    countTmp = 0;
//                    countVal.setText(Integer.toString(countTmp));
//                }
//            });
        }





    }


