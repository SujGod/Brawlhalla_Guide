package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.axe.*





class Axe: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.axe)

        slight_dlight_axe.setOnClickListener {
            startActivity(Intent(this, AxeSlightDlightVideo::class.java))
            mp.pause()
        }

        slight_nair_axe.setOnClickListener {
            startActivity(Intent(this, AxeSlightNairVideo::class.java))
            mp.pause()
        }

        slight_sair_axe.setOnClickListener {
            startActivity(Intent(this, AxeSlightSairVideo::class.java))
            mp.pause()
        }

        slight_dair_axe.setOnClickListener {
            startActivity(Intent(this, AxeSlightDairVideo::class.java))
            mp.pause()
        }

    }


}