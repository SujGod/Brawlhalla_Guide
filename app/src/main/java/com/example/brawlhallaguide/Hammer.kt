package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.axe.*
import kotlinx.android.synthetic.main.hammer.*
import kotlinx.android.synthetic.main.orb.*
import kotlinx.android.synthetic.main.unarmed.*

class Hammer: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.hammer)

        hammer_dlight_slight.setOnClickListener {
            startActivity(Intent(this, HammerDlightSlightVideo::class.java))
            button.start()
            mp.pause()
        }

        hammer_dlight_jmp_gc_nlight.setOnClickListener {
            startActivity(Intent(this, HammerDlightJmpGCNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        hammer_dlight_dair.setOnClickListener {
            startActivity(Intent(this, HammerDlightDairVideo::class.java))
            button.start()
            mp.pause()
        }

        hammer_dlight_nair.setOnClickListener {
            startActivity(Intent(this, HammerDlightNairVideo::class.java))
            button.start()
            mp.pause()
        }

        hammer_dlight_sair.setOnClickListener {
            startActivity(Intent(this, HammerDlightSairVideo::class.java))
            button.start()
            mp.pause()
        }


        hammer_dlight_dodge_dair.setOnClickListener {
            startActivity(Intent(this, HammerDlightDodgeDairVideo::class.java))
            button.start()
            mp.pause()
        }

        hammer_dlight_dodge_recovery.setOnClickListener {
            startActivity(Intent(this, HammerDlightDodgeRecoveryVideo::class.java))
            button.start()
            mp.pause()
        }


    }


}