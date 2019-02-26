package com.example.makotoyuasa.timer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Timer;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Timer timer = new Timer();


        Button start_button = (Button)findViewById(R.id.start_button);
        start_button.setText("スタート");
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button finish_button = (Button)findViewById(R.id.finish_button);
        finish_button.setText("終了する");
        finish_button.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v) {
                finish(); // Activityを終了させる
            }
        });
    }
}
