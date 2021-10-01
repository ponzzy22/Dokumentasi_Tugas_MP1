package com.example.bobagarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val back1 = findViewById<ImageView>(R.id.back1)


        back1.setOnClickListener {
            val MainActivity = Intent( this@Profil, MainActivity::class.java)
            startActivity(MainActivity)
        }


    }
}