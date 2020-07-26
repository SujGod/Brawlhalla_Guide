package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.axe.*
import kotlinx.android.synthetic.main.orb.*

class Orb: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.orb)

        orb_slight_dlight.setOnClickListener {
            startActivity(Intent(this, OrbSlightDlightVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_slight_sair.setOnClickListener {
            startActivity(Intent(this, OrbSlightSairVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_dlight_nair.setOnClickListener {
            startActivity(Intent(this, OrbDlightNairVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_nlight_slight.setOnClickListener {
            startActivity(Intent(this, OrbNlightSlightVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_dlight_gc_nlight.setOnClickListener {
            startActivity(Intent(this, OrbDlightGCNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_dlight_gc_slight.setOnClickListener {
            startActivity(Intent(this, OrbDlightGCSlightVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_jmp_gc_slight_nair.setOnClickListener {
            startActivity(Intent(this, OrbJmpGCSlightNairVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_dair_nlight.setOnClickListener {
            startActivity(Intent(this, OrbDairNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        orb_dair_slight.setOnClickListener {
            startActivity(Intent(this, OrbDairSlightVideo::class.java))
            button.start()
            mp.pause()
        }


    }


}