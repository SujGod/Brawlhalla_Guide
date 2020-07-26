package com.example.brawlhallaguide


import android.media.MediaPlayer
import android.media.ToneGenerator.MAX_VOLUME
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Toast.makeText
import androidx.lifecycle.ViewModelProviders

import com.example.brawlhallaguide.R
import kotlinx.android.synthetic.main.fragment_fragment1.*
import kotlinx.android.synthetic.main.options.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment1 : Fragment() {

    var strength: ToggleButton? = null
    var dexterity: ToggleButton? = null
    var defense: ToggleButton? = null
    var speed: ToggleButton? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater?.inflate(R.layout.fragment_fragment1, container, false)
        var noStanceEnabled = true

        strength = view.findViewById(R.id.strengthToggle)
        dexterity = view.findViewById(R.id.dexterityToggle)
        defense = view.findViewById(R.id.defenseToggle)
        speed = view.findViewById(R.id.speedToggle)

        strength?.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                button.setVolume(0.25f, 0.25f)
                button.start()
                if (noStanceEnabled) {
                    strengthBar.progress = 7
                    defenseBar.progress = 2
                    strengthBarText.text = "Strength: 7"
                    defenseBarText.text = "Defense: 2"
                }
                noStanceEnabled = false
            } else {
                button.setVolume(0.25f, 0.25f)
                button.start()
                strengthBar.progress = 6
                defenseBar.progress = 3
                strengthBarText.text = "Strength: 6"
                defenseBarText.text = "Defense: 3"
                noStanceEnabled = true
            }
        }

        dexterity?.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                button.setVolume(0.25f, 0.25f)
                button.start()
                if (noStanceEnabled) {
                    dexterityBar.progress = 8
                    speedBar.progress = 5
                    dexterityBarText.text = "Dexterity: 8"
                    speedBarText.text = "Speed: 5"
                }
                noStanceEnabled = false
            } else {
                button.setVolume(0.25f, 0.25f)
                button.start()
                dexterityBar.progress = 7
                speedBar.progress = 6
                dexterityBarText.text = "Dexterity: 7"
                speedBarText.text = "Speed: 6"
                noStanceEnabled = true
            }
        }

        defense?.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                button.setVolume(0.25f, 0.25f)
                button.start()
                if (noStanceEnabled) {
                    dexterityBar.progress = 6
                    defenseBar.progress = 4
                    dexterityBarText.text = "Dexterity: 6"
                    defenseBarText.text = "Defense: 4"
                }
                noStanceEnabled = false
            } else {
                button.setVolume(0.25f, 0.25f)
                button.start()
                dexterityBar.progress = 7
                defenseBar.progress = 3
                dexterityBarText.text = "Dexterity: 7"
                defenseBarText.text = "Defense: 3"
                noStanceEnabled = true
            }
        }

        speed?.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                button.setVolume(0.25f, 0.25f)
                button.start()
                if (noStanceEnabled) {
                    strengthBar.progress = 5
                    speedBar.progress = 7
                    strengthBarText.text = "Strength: 5"
                    speedBarText.text = "Speed: 7"
                }
                noStanceEnabled = false
            } else {
                button.setVolume(0.25f, 0.25f)
                button.start()
                strengthBar.progress = 6
                speedBar.progress = 6
                strengthBarText.text = "Strength: 6"
                speedBarText.text = "Speed: 6"
                noStanceEnabled = true
            }
        }

        return view
    }

}
