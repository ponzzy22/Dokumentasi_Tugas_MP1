package com.example.bobagarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Kategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val back5 = findViewById<ImageView>(R.id.back5)

        back5.setOnClickListener {
            val MainActivity = Intent(this@Kategori, MainActivity::class.java)
            startActivity(MainActivity)
        }
    }
}