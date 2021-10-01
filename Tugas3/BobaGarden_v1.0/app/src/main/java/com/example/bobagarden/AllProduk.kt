package com.example.bobagarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AllProduk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_produk)

        val back7 = findViewById<ImageView>(R.id.back7)


        back7.setOnClickListener {
            val MainActivity = Intent(this@AllProduk, MainActivity::class.java)
            startActivity(MainActivity)
        }
    }
}