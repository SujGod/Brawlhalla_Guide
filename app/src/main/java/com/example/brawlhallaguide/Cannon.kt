package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bow.*
import kotlinx.android.synthetic.main.bow.nlight_nair_bow
import kotlinx.android.synthetic.main.cannon.*


class Cannon: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cannon)

        cannon_dlight_sair.setOnClickListener {
            startActivity(Intent(this, CannonDlightSairVideo::class.java))
        }

        cannon_dlight_dair.setOnClickListener {
            startActivity(Intent(this, CannonDlightDairVideo::class.java))
        }

        cannon_dlight_nair.setOnClickListener {
            startActivity(Intent(this, CannonDlightNairVideo::class.java))
        }

        cannon_sair_slight.setOnClickListener {
            startActivity(Intent(this, CannonSairSlightVideo::class.java))
        }

        cannon_slight_sair.setOnClickListener {
            startActivity(Intent(this, CannonSlightSairVideo::class.java))
        }

        cannon_slight_dair.setOnClickListener {
            startActivity(Intent(this, CannonSlightDairVideo::class.java))
        }

    }



}