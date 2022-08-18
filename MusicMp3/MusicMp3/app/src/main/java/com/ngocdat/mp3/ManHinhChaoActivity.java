package com.ngocdat.mp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import java.util.Timer;
import java.util.TimerTask;

public class ManHinhChaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mahinhchao);
        //Chuyển đến màn hình chính sau 2s
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(ManHinhChaoActivity.this, MainActivity.class));
            }
        }, 2000);
    }
}