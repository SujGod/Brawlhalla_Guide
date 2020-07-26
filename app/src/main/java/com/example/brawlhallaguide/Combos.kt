package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.combos.*


class Combos:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.combos)

        blasters.setOnClickListener {
            startActivity(Intent(this, Blasters::class.java))
            button.start()
        }

        axe.setOnClickListener {
            startActivity(Intent(this, Axe::class.java))
            button.start()
        }

        spear.setOnClickListener {
            startActivity(Intent(this, Spear::class.java))
            button.start()
        }

        bow.setOnClickListener {
            startActivity(Intent(this, Bow::class.java))
            button.start()
        }

        cannon.setOnClickListener {
            startActivity(Intent(this, Cannon::class.java))
            button.start()
        }

        orb.setOnClickListener {
            startActivity(Intent(this, Orb::class.java))
            button.start()
        }

        lance.setOnClickListener {
            startActivity(Intent(this, Lance::class.java))
            button.start()
        }

        sword.setOnClickListener {
            startActivity(Intent(this, Sword::class.java))
            button.start()
        }

        unarmed.setOnClickListener {
            startActivity(Intent(this, Unarmed::class.java))
            button.start()
        }

        katars.setOnClickListener {
            startActivity(Intent(this, Katars::class.java))
            button.start()
        }

    }

}