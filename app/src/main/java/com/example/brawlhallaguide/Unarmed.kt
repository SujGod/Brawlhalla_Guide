package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.axe.*
import kotlinx.android.synthetic.main.orb.*
import kotlinx.android.synthetic.main.unarmed.*

class Unarmed: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.unarmed)

        unarmed_sair_nlight.setOnClickListener {
            startActivity(Intent(this, UnarmedSairNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dash_slight_nlight.setOnClickListener {
            startActivity(Intent(this, UnarmedDashSlightNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_nair.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightNairVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_sair.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightSairVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_dair.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightDairVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_recovery.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightRecoveryVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_gp.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightGroundPoundVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_jmp_gc_nlight.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightJmpGCNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_jmp_gc_slight.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightJmpGCSlightVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_jmp_gc_nsig.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightJmpGCNsigVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_jmp_gc_dsig.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightJmpGCDsigVideo::class.java))
            button.start()
            mp.pause()
        }

        unarmed_dlight_jmp_gc_dlight.setOnClickListener {
            startActivity(Intent(this, UnarmedDlightJmpGCDlightVideo::class.java))
            button.start()
            mp.pause()
        }

    }


}