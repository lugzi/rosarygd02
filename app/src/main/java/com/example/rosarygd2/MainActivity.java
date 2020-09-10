package com.example.rosarygd2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        }


       CardView cardView1=findViewById(R.id.cardView);
       CardView cardView2=findViewById(R.id.cardView2);

  cardView1.setOnClickListener(new View.OnClickListener() {
       @Override public void onClick(View view) {
           Intent intent1=new Intent(MainActivity.this,counts.class);
           startActivity(intent1);
       }
   });


cardView2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent1=new Intent(MainActivity.this,aboutpage.class);
        startActivity(intent1);
    }
});


    }
}