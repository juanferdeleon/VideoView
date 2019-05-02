package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.video_view)
        val videoUri = Uri.parse("android.resource://" + this.packageName + "/" + R.raw.video)
        videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)

        mediaController.setAnchorView(videoView)

    }
}
