package com.athyamsha.audiovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private VideoView playVideo;
    private Button playButton;
    private MediaController myMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        playVideo = findViewById(R.id.playVideo);

        playButton.setOnClickListener(MainActivity.this);
        myMediaController = new MediaController(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        Uri videoPath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nature);

        playVideo.setVideoURI(videoPath);

        playVideo.setMediaController(myMediaController);
        myMediaController.setAnchorView(playVideo);

        playVideo.start();
    }
}
