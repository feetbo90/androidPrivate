package com.example.muhammadiqbalpradipta.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_main.*

class CekNull : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek_null)

        tambah.setOnClickListener(View.OnClickListener {
            var bil: Int? = 0
            var bil2:Int? = 0

            if (bilangan.text.toString().toIntOrNull() != null && bilangan2.text.toString().toIntOrNull() != null)
            {
                bil = bilangan.text.toString().toInt()
                bil2 = bilangan2.text.toString().toInt()
                var tambah =bil + bil2
                hasil.text = "$tambah"
            }



        })


    }
}
