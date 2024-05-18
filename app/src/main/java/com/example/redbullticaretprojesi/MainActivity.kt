package com.example.redbullticaretprojesi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.redbullticaretprojesi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAtletler.setOnClickListener {
            intent = Intent(applicationContext, MainActivityAtletler::class.java)
            startActivity(intent)
        }
        binding.buttonUrunler.setOnClickListener {
            intent = Intent(applicationContext, MainActivityUrunler::class.java)
            startActivity(intent)
        }


    }

}


