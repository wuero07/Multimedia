package com.example.multimediaapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AudioActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private boolean isPaused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);


        initializeMediaPlayer();

        Button btnPauseAudio = findViewById(R.id.btn_pause_audio);
        Button btnPlayAudio = findViewById(R.id.btn_play_audio);
        Button btnReturnAudio = findViewById(R.id.btn_return_audio);

        btnPauseAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    isPaused = true;
                }
            }
        });

        btnPlayAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    initializeMediaPlayer();
                }
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    isPaused = false;
                }
            }
        });

        btnReturnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                releaseMediaPlayer();
                finish();
            }
        });


        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    private void initializeMediaPlayer() {
        try {
            mediaPlayer = MediaPlayer.create(this, R.raw.audio_file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseMediaPlayer();
    }
}

