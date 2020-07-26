package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.axe.*
import kotlinx.android.synthetic.main.combos.*
import kotlinx.android.synthetic.main.orb.*
import kotlinx.android.synthetic.main.spear.*

class Spear: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.spear)

        spear_slight_dlight.setOnClickListener {
            startActivity(Intent(this, SpearSlightDlightVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_nlight_dash_slight.setOnClickListener {
            startActivity(Intent(this, SpearNlightDashSlightVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_sair_nlight.setOnClickListener {
            startActivity(Intent(this, SpearSairNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_dlight_sair.setOnClickListener {
            startActivity(Intent(this, SpearDlightSairVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_dlight_nair.setOnClickListener {
            startActivity(Intent(this, SpearDlightNairVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_dlight_recovery.setOnClickListener {
            startActivity(Intent(this, SpearDlightRecoveryVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_dlight_dodge_groundPound.setOnClickListener {
            startActivity(Intent(this, SpearDlightDodgeGroundPoundVideo::class.java))
            button.start()
            mp.pause()
        }

        spear_dlight_gc_dlight.setOnClickListener {
            startActivity(Intent(this, SpearDlightGCDlightVideo::class.java))
            button.start()
            mp.pause()
        }

    }


}