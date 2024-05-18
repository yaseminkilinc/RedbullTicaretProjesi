package com.example.redbullticaretprojesi


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.redbullticaretprojesi.databinding.ActivityMainUrunlerBinding

class MainActivityUrunler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainUrunlerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGeriUrunler.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        binding.girisyap.setOnClickListener {
            intent = Intent(applicationContext, MainActivityGirisEkrani::class.java)
            startActivity(intent)
        }

        data class Urun(
            val id: Int,
            val ad:String,
            val fiyat:Double,
            val resim:Int
        )

        val urunler = listOf(
            Urun(1, "Enerji İçeceği", 100.0, R.drawable.redbulenerjicecegi),
            Urun(2, "Winter Edition", 150.0, R.drawable.redbulwinter1),
            Urun(3, "White Edition", 200.0, R.drawable.whiteedition),
            Urun(4, "Yellow Edition", 250.0, R.drawable.yellowedition))

    }}

