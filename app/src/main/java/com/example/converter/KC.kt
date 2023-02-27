package com.example.converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class KC : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_k_c2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun Solution(input : String){
            var res = view.findViewById<TextView>(R.id.K2C_result)
            try {
                var inp = input.toDouble() - 273.15

                res.setText(inp.toString())
            }catch (e:Exception){
                res.setHint("Enter numbers only")
            }
        }
        val conv_btn = view.findViewById<Button>(R.id.conv_btn_kc)
        val input_area= view.findViewById<EditText>(R.id.KCinput)
        conv_btn.setOnClickListener { Solution(input_area.getText().toString())}
    }


}