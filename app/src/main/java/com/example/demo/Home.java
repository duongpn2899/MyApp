package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button button1,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1 = (Button) findViewById(R.id.btnOnline);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,MainActivity.class);
                startActivity(intent);
            }
        });


        button5 = (Button) findViewById(R.id.btnThoat);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finishAffinity();
               System.exit(0);
            }
        });

    }

}