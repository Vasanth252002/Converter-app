package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    var fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun loadFragment(f : Fragment){
        val fragmentTransactions= fragmentManager.beginTransaction()
        fragmentTransactions.replace(R.id.fragloadarea, f)
        fragmentTransactions.addToBackStack(null)
        fragmentTransactions.commit()
        }

        val KC_converter = findViewById<Button>(R.id.KelvinCel)
        val KF_converter = findViewById<Button>(R.id.KelvinFar)
        val CK_converter = findViewById<Button>(R.id.CelciusKel)
        val CF_converter = findViewById<Button>(R.id.CelciusFar)
        val FC_converter = findViewById<Button>(R.id.FarenCel)
        val FK_converter = findViewById<Button>(R.id.FarenKel)

        KC_converter.setOnClickListener { loadFragment(KC()) }
        KF_converter.setOnClickListener { loadFragment(KF()) }
        CK_converter.setOnClickListener { loadFragment(CK()) }
        CF_converter.setOnClickListener { loadFragment(CF()) }
        FC_converter.setOnClickListener { loadFragment(FC()) }
        FK_converter.setOnClickListener { loadFragment(FK()) }

    }
}


