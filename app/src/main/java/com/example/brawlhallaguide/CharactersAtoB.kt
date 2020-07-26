package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.atob.*
import kotlinx.android.synthetic.main.brawlvideo.*
import kotlinx.android.synthetic.main.characters.*

class CharactersAtoB: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.atob)

        adaButton.setOnClickListener {
            startActivity(Intent(this, Ada::class.java))
            button.start()
        }

    }
}