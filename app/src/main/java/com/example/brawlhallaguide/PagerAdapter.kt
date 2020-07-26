package com.example.brawlhallaguide

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class pageradapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return Fragment1()
            1 -> return Fragment2()
            else-> return Fragment3()
        }
    }

    override fun getCount(): Int {
        return 3
    }

}