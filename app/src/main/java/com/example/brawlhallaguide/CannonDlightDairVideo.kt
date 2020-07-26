package com.example.brawlhallaguide

import android.os.Bundle
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.brawlvideo.*

class CannonDlightDairVideo: AppCompatActivity() {

    private fun hideSystemUI() {
        val decorView = window.decorView
        decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.brawlvideo)
        hideSystemUI()

        var mediacontroller = MediaController(this)
        var videoView = video_view
        mediacontroller.setAnchorView(videoView)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.cannondlightdair)
        videoView.start()


    }
}