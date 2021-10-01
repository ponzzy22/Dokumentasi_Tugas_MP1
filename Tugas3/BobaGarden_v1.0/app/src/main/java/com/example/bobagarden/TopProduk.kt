package com.example.bobagarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TopProduk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_produk)

        val back2 = findViewById<ImageView>(R.id.back2)


        back2.setOnClickListener {
            val MainActivity = Intent(this@TopProduk, MainActivity::class.java)
            startActivity(MainActivity)
        }
    }
}