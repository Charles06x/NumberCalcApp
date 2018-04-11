package com.example.hp.numbercalcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val numberTypes1 = arrayOf("Binario", "Octal", "Hexadecimal", "Decimal")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner1!!.setOnItemSelectedListener(this)
        spinner2!!.setOnItemSelectedListener(this)

        val aA1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, numberTypes1)
        val aA2 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, numberTypes1)

        spinner1!!.adapter = aA1
        spinner2!!.adapter = aA2
    }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {

    }
    fun decToOctal(){

    }
}
