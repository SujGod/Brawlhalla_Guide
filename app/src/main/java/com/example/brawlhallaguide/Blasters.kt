package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.blasters.*


class Blasters: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.blasters)

        dlight_sair_blasters.setOnClickListener {
            startActivity(Intent(this, BlastersDlightSairVideo::class.java))
        }

        dlight_slight_blasters.setOnClickListener {
            startActivity(Intent(this, BlastersDlightSlightVideo::class.java))
        }

        dlight_recovery_blasters.setOnClickListener {
            startActivity(Intent(this,BlastersDlightRecoveryVideo::class.java))
        }

        dlight_dair_blasters.setOnClickListener {
            startActivity(Intent(this,BlastersDlightDairVideo::class.java))
        }

        sair_nlight.setOnClickListener {
            startActivity(Intent(this, BlastersSairNlightVideo::class.java))
        }

        sair_dlight_blasters.setOnClickListener {
            startActivity(Intent(this, BlastersSairDlightVideo::class.java))
        }


    }



}