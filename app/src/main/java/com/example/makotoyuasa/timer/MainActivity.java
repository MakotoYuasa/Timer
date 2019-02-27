package com.example.makotoyuasa.timer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button1);
        button.setText("4 minute");
        button.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });
    }




}
