package com.example.multimediaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlayAudio = findViewById(R.id.btn_play_audio);
        Button btnPlayVideoMP = findViewById(R.id.btn_play_video_mp);
        Button btnPlayVideoSV = findViewById(R.id.btn_play_video_sv);
        Button btnPlayVideoVV = findViewById(R.id.btn_play_video_vv);
        Button btnTakePhoto = findViewById(R.id.btn_take_photo);

        btnPlayAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AudioActivity.class);
                startActivity(intent);
            }
        });

        btnPlayVideoMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoMPActivity.class);
                startActivity(intent);
            }
        });

        btnPlayVideoSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoSVActivity.class);
                startActivity(intent);
            }
        });

        btnPlayVideoVV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoVVActivity.class);
                startActivity(intent);
            }
        });

        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
    }
}
