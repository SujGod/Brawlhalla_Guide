package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.axe.*
import kotlinx.android.synthetic.main.combos.*
import kotlinx.android.synthetic.main.katars.*
import kotlinx.android.synthetic.main.orb.*
import kotlinx.android.synthetic.main.spear.*

class Katars: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.katars)

        katars_slight_nlight.setOnClickListener {
            startActivity(Intent(this, KatarsSlightNlightVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_slight_dash_dlight.setOnClickListener {
            startActivity(Intent(this, KatarsSlightDashDlightVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_slight_jmp_dair.setOnClickListener {
            startActivity(Intent(this, KatarsSlightDairVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_dair_dlight.setOnClickListener {
            startActivity(Intent(this, KatarsDairDlightVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_dlight_jmp_dair.setOnClickListener {
            startActivity(Intent(this, KatarsDlightDairVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_dlight_jmp_revdair.setOnClickListener {
            startActivity(Intent(this, KatarsDlightReverseDairVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_dlight_nair.setOnClickListener {
            startActivity(Intent(this, KatarsDlightNairVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_dlight_recovery.setOnClickListener {
            startActivity(Intent(this, KatarsDlightRecoveryVideo::class.java))
            button.start()
            mp.pause()
        }

        katars_nlight_dlight.setOnClickListener {
            startActivity(Intent(this, KatarsNlightDlightVideo::class.java))
            button.start()
            mp.pause()
        }



    }


}