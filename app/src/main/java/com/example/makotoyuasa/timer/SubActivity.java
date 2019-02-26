package com.example.makotoyuasa.timer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SubActivity extends AppCompatActivity {

    private TextView textview;
    private Button start_button, finish_button;
    private android.os.Handler handler = new android.os.Handler();
    private Timer timer;
    private TimerTask timerTask;
    private int count; // カウンタ変数
    private int second = 4 * 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        textview = (TextView)findViewById(R.id.textView);
        textview.setTextSize(45);
        textview.setTextColor(Color.BLUE);
        textview.setGravity(Gravity.CENTER); // 中央寄せ
        textview.setText("04:00"); // 4分

        start_button = (Button)findViewById(R.id.start_button);
        start_button.setText("スタート");
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = 4 * 6;
                timer = new Timer();
                timerTask = new Task(); // タイマー時の動作
                timer.schedule(timerTask, 1000, 1000);
            }
        });

        finish_button = (Button)findViewById(R.id.finish_button);
        finish_button.setText("終了する");
        finish_button.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v) {
                finish(); // Activityを終了させる
            }
        });
    }

    public class Task extends TimerTask {
        @Override
        public void run() {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    //タイマー作動時の実際の動作（カウントアップ）
                    second -= 1;
                    //テキストビューに現在のカウント値を表示する
                    textview.setText(String.valueOf(second/60) + ":" + String.valueOf(second%60));
                    if(second <= 0) {
                        timer.cancel();
                    }
                }
            });
        }
    }
}
