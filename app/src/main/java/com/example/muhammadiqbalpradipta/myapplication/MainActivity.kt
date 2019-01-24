package com.example.muhammadiqbalpradipta.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // Intent deklarasi objek dari applicationContext ke halaman kedua
        var pindahHalaman = Intent(applicationContext, HalamaKedua::class.java)

        // tombol button tambah untuk user tekn
        tambah.setOnClickListener(View.OnClickListener {

            //var bil = bilangan.text.toString().toInt() untuk ambil nilai dan parsing ke int

            var bil = bilangan.text.toString().toInt()
            // putExtra utk kirim nilai
            pindahHalaman.putExtra("bilangan", bil)
            // startActivity untuk execute pindah halaman
            startActivity(pindahHalaman)


        })


    }
}
