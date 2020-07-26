package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.characters.*

class Characters: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.characters)

        atob.setOnClickListener {
            startActivity(Intent(this, CharactersAtoB::class.java))
            button.start()
        }

        btoc.setOnClickListener {
            startActivity(Intent(this, CharactersBtoC::class.java))
            button.start()
        }

        dtog.setOnClickListener {
            startActivity(Intent(this, Characters::class.java))
            button.start()
        }



    }

}