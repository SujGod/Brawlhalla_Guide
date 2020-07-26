package com.example.brawlhallaguide

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class Ada: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.ada)

        val adapter = pageradapter(supportFragmentManager)
        val pager = findViewById<View>(R.id.pager) as ViewPager

        pager.adapter = adapter

    }
}