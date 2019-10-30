package com.example.login2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)


        val intent = intent
        val nama = findViewById<EditText>(R.id.nama)
        val alamat = findViewById<EditText>(R.id.alamat)
        val tempat = findViewById<EditText>(R.id.TTL)
        val asalku = findViewById<EditText>(R.id.asal)
        val das = findViewById<Button>(R.id.dasboard)
        val prev = findViewById<Button>(R.id.preview)

        das.setOnClickListener{
            val intent = Intent(this@second,dasboard::class.java)
            startActivity(intent)


        }
        prev.setOnClickListener{


            if (nama.text.isEmpty() ||alamat.text.isEmpty() || TTL.text.isEmpty() || asal.text.isEmpty()){
                toast("Data Tidak Boleh Kosong ",Toast.LENGTH_LONG)
            }
            else{
                val name = nama.text.toString()
                val address = alamat.text.toString()
                val place = tempat.text.toString()
                val from = asalku.text.toString()
                val intent =  Intent(this@second,preview::class.java)
                intent.putExtra("nama",name)
                intent.putExtra("alamat",address)
                intent.putExtra("tempat",place)
                intent.putExtra("dari",from)
                startActivity(intent)
            }
        }

    }
    private fun toast(pesan: String, length: Int= Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan ,length).show()

    }
}