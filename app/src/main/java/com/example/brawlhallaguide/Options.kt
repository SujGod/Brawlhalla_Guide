package com.example.brawlhallaguide

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.SeekBar
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.options.*
import android.media.ToneGenerator.MAX_VOLUME

var firstTime = true
var firstTime2 = true
var musicIsChecked = false
var sfxIsChecked = false
var seekProgress = 0
var seek2Progress = 0

class Options:AppCompatActivity() {

//  val audioManager: AudioManager = getSystemService(AUDIO_SERVICE) as AudioManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.options)

        val music: ToggleButton = findViewById(R.id.musicToggle)
        val sfx: ToggleButton = findViewById(R.id.soundToggle)

        if (firstTime) {
            musicBar.progress = 25
        }
        else {
            if (!music.isChecked) {
                musicBar.progress = seekProgress
            }
        }


        if (firstTime2) {
            sfxBar.progress = 25
        }
        else {
            if (!music.isChecked) {
                sfxBar.progress = seek2Progress
            }
        }



        if (musicIsChecked) {
            music.isChecked = true
            musicBar.progress = 0
        }
        if (sfxIsChecked) {
            sfx.isChecked = true
            sfxBar.progress = 0
        }

       // val audioManager: AudioManager = getSystemService(AUDIO_SERVICE) as AudioManager

        music.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                button.setVolume(0.25f, 0.25f)
                button.start()
                mp.stop()
                musicBar.progress = 0
                musicIsChecked = true
            } else {
                button.setVolume(0.25f, 0.25f)
                button.start()
                mp = MediaPlayer.create(this, R.raw.bthemeremix)
                mp.isLooping = true
                mp.setVolume(0.12f, 0.12f)
                musicBar.progress = 25
                mp.start()
                musicIsChecked = false
            }
        }

        sfx.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                button.setVolume(0.25f, 0.25f)
                button.start()
                button.stop()
                sfxBar.progress = 0
                sfxIsChecked = true
            } else {
                button = MediaPlayer.create(this, R.raw.button)
                button.isLooping = false
                button.setVolume(0.25f, 0.25f)
                sfxBar.progress = 25
                button.start()
                sfxIsChecked = false
            }
        }

        musicBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    val volume = (1 - Math.log((MAX_VOLUME - i).toDouble()) / Math.log(MAX_VOLUME.toDouble())).toFloat()
                    mp.setVolume(volume, volume)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                firstTime = false
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                seekProgress = musicBar.progress
            }
        })

        sfxBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    val volume = (1 - Math.log((MAX_VOLUME - i).toDouble()) / Math.log(MAX_VOLUME.toDouble())).toFloat()
                    button.setVolume(volume, volume)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                firstTime2 = false
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                seek2Progress = sfxBar.progress
            }
        })

    }
}

