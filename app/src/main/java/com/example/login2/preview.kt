package com.example.login2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class preview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preview)

        val intent = intent
        val nama = intent.getStringExtra("nama")
        val alamat = intent.getStringExtra("alamat")
        val ttl = intent.getStringExtra("tempat")
        val asal = intent.getStringExtra("dari")

        val preview =  findViewById<TextView>(R.id.preview)
        preview.text = "Nama    :"+nama+"\nAlamat     :"+alamat+"\nTempat Tanggal Lahir   :"+ttl+"\nAsal    :"+asal



    }
}