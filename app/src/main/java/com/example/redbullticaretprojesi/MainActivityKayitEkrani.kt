package com.example.redbullticaretprojesi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.redbullticaretprojesi.databinding.ActivityMainKayitEkraniBinding
import com.google.firebase.Firebase
import com.google.firebase.database.database

class MainActivityKayitEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKayitEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGiriseDon.setOnClickListener {
            intent = Intent(applicationContext, MainActivityGirisEkrani::class.java)
            startActivity(intent)
        }

        binding.kayittanasayfa.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun kayitButon (view: View){
        var database = Firebase.database.reference
        val emailBilgileriKayit = findViewById<EditText>(R.id.emailBilgileriKayit)
        var deger = emailBilgileriKayit.text.toString()
        database.child("Email Adresi:").setValue(deger)
    }

}