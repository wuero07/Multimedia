package com.example.multimediaapp;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoVVActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_vv);

        videoView = findViewById(R.id.video_view_vv);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_file3));
        videoView.start();

        Button btnPauseVideoVV = findViewById(R.id.btn_pause_video_vv);
        Button btnPlayVideoVV = findViewById(R.id.btn_play_video_vv);
        Button btnReturnVideoVV = findViewById(R.id.btn_return_video_vv);

        btnPauseVideoVV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView != null && videoView.isPlaying()) {
                    videoView.pause();
                }
            }
        });

        btnPlayVideoVV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView != null && !videoView.isPlaying()) {
                    videoView.start();
                }
            }
        });

        btnReturnVideoVV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView != null && videoView.isPlaying()) {
                    videoView.stopPlayback();
                }
                finish();
            }
        });
    }
}
