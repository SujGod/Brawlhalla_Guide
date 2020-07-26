package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bow.*


class Bow: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bow)

        dlight_nlight_bow.setOnClickListener {
            startActivity(Intent(this, BowDlightNlightVideo::class.java))
        }

        dlight_nair_bow.setOnClickListener {
            startActivity(Intent(this, BowDlightNairVideo::class.java))
        }

        dlight_sair_bow.setOnClickListener {
            startActivity(Intent(this, BowDlightSairVideo::class.java))
        }

        dlight_dair_bow.setOnClickListener {
            startActivity(Intent(this, BowDlightDairVideo::class.java))
        }

        dlight_recovery_bow.setOnClickListener {
            startActivity(Intent(this, BowDlightRecoveryVideo::class.java))
        }

        nlight_nair_bow.setOnClickListener {
            startActivity(Intent(this, BowNlightNairVideo::class.java))
        }

    }



}