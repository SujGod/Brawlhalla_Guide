package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.lance.*


class Lance: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lance)

        lance_slight_dair.setOnClickListener {
            startActivity(Intent(this, LanceSlightDairVideo::class.java))
        }

        lance_slight_nair.setOnClickListener {
            startActivity(Intent(this, LanceSlightNairVideo::class.java))
        }

        lance_slight_recovery.setOnClickListener {
            startActivity(Intent(this, LanceSlightRecoveryVideo::class.java))
        }

        lance_nlight_dash_dlight.setOnClickListener {
            startActivity(Intent(this, LanceNlightDashDlightVideo::class.java))
        }

       lance_slight_gc_nlight.setOnClickListener {
            startActivity(Intent(this, LanceSlightGCNlight::class.java))
        }

        lance_slight_sair.setOnClickListener {
            startActivity(Intent(this, LanceSlightSairVideo::class.java))
        }

    }



}