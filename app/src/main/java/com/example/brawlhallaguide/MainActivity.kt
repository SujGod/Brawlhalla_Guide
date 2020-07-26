package com.example.brawlhallaguide

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

lateinit var mp: MediaPlayer
lateinit var button: MediaPlayer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this, R.raw.bthemeremix)
        mp.isLooping = true
        mp.setVolume(0.12f, 0.12f)
        mp.start()

        button = MediaPlayer.create(this, R.raw.button)
        button.isLooping = false
        button.setVolume(0.25f, 0.25f)

        charactersButton.setOnClickListener {
            startActivity(Intent(this, Characters::class.java))
            button.start()
        }

        aboutButton.setOnClickListener {
            startActivity(Intent(this, About::class.java))
            button.start()
        }

        optionsButton.setOnClickListener {
            startActivity(Intent(this, Options::class.java))
            button.start()
        }

        combosButton.setOnClickListener {
            startActivity(Intent(this, Combos::class.java))
            button.start()
        }

    }



}
