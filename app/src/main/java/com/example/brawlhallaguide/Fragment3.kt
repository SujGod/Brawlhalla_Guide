package com.example.brawlhallaguide


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.example.brawlhallaguide.R
import kotlinx.android.synthetic.main.combos.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment3 : Fragment() {

    var blastersButton: Button? = null
    var spearButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater?.inflate(R.layout.fragment_fragment3, container, false)

        blastersButton = view.findViewById(R.id.blastersAda)
        spearButton = view.findViewById(R.id.spearAda)

        blastersButton?.setOnClickListener {
            activity?.let { callingActivity -> startActivity(Intent(callingActivity, Blasters::class.java)) }
        }

        spearButton?.setOnClickListener {
            activity?.let { callingActivity -> startActivity(Intent(callingActivity, Spear::class.java)) }
        }


        // Inflate the layout for this fragment
        return view
    }


}
