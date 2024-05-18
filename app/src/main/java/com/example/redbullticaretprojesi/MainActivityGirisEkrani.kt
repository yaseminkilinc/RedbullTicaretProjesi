package com.example.redbullticaretprojesi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.redbullticaretprojesi.databinding.ActivityMainGirisEkraniBinding


class MainActivityGirisEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainGirisEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hesabimYok.setOnClickListener {
            intent = Intent(applicationContext, MainActivityKayitEkrani::class.java)
            startActivity(intent)
        }


        binding.buttongiris.setOnClickListener {
            val kullaniciAdi = binding.kullaniciadiGiris.text.toString()
            val sifre = binding.sifreBilgisiGiris.text.toString()

            // Kullanıcı adı ve şifre doğrulaması
            if (kullaniciAdi == "abcdef" && sifre == "1234") {
                // Doğru ise ürünler sayfasına yönlendir
                val intent = Intent(this, MainActivityUrunler::class.java)
                startActivity(intent)
            } else {
                // Hatalı giriş
                Toast.makeText(this, "Hatalı kullanıcı adı veya şifre", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
