package com.example.bobagarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Keranjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang)

        val back33 = findViewById<ImageView>(R.id.back33)

        back33.setOnClickListener {
            val MainActivity = Intent(this@Keranjang, MainActivity::class.java)
            startActivity(MainActivity)
        }
    }
}