package com.example.muhammadiqbalpradipta.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative.*

class HalamaKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halama_kedua)

        // getIntentExtra untuk mengambil nilai dari MainActivity
        var terima = intent.getIntExtra("bilangan", 0)
        // untuk set nilai ke TextView
        text1.text = "$terima"

    }
}
