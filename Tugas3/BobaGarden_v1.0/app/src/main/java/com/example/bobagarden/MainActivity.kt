package com.example.bobagarden

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profil = findViewById<TextView>(R.id.profil)
        val allproduk = findViewById<TextView>(R.id.allproduk)
        val kategori = findViewById<TextView>(R.id.kategori)
        val keranjang = findViewById<TextView>(R.id.keranjang)
        val kontak = findViewById<TextView>(R.id.kontak)


        profil.setOnClickListener {
            val Profil = Intent(this@MainActivity, Profil::class.java)
            startActivity(Profil)
        }
        allproduk.setOnClickListener {
            val AllProduk = Intent(this@MainActivity, AllProduk::class.java)
            startActivity(AllProduk)
        }
        kategori.setOnClickListener {
            val Kategori = Intent( this@MainActivity, Kategori::class.java )
            startActivity(Kategori)
        }
        keranjang.setOnClickListener {
            val Keranjang = Intent( this@MainActivity, Keranjang::class.java)
            startActivity(Keranjang)
        }
        kontak.setOnClickListener {
            val TopProduk = Intent( this@MainActivity, TopProduk::class.java)
            startActivity(TopProduk)
        }



    }
}