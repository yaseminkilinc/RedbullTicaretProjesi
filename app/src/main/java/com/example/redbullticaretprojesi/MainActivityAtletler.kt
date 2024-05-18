package com.example.redbullticaretprojesi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.redbullticaretprojesi.databinding.ActivityMainAtletlerBinding
import com.example.redbullticaretprojesi.databinding.ActivityMainBinding

class MainActivityAtletler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainAtletlerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGeriAtletler.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}