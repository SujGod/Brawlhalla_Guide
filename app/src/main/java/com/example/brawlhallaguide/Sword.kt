package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sword.*


class Sword: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sword)

        dlight_jmp_sair_sword.setOnClickListener {
            startActivity(Intent(this, SwordDlightJmpSair::class.java))
            button.start()
            mp.pause()
        }

        dlight_nair_sword.setOnClickListener {
            startActivity(Intent(this, SwordDlightNair::class.java))
            button.start()
            mp.pause()
        }

        dlight_recovery_sword.setOnClickListener {
            startActivity(Intent(this, SwordDlightRecovery::class.java))
            button.start()
            mp.pause()
        }

        dlight_jmp_dair_sword.setOnClickListener {
            startActivity(Intent(this, SwordDlightJmpDair::class.java))
            button.start()
            mp.pause()
        }

        dlight_jmp_gc_nlight_sword.setOnClickListener {
            startActivity(Intent(this, SwordDlightJmpGCNlight::class.java))
            button.start()
            mp.pause()
        }

        dlight_gc_slight_sword.setOnClickListener {
            startActivity(Intent(this, SwordDlightJmpGCSlight::class.java))
            button.start()
            mp.pause()
        }

    }



}