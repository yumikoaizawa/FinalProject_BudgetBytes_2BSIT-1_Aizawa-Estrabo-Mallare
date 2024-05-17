package com.labactivity.recyclerview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.recyclerview.databinding.ActivityStartScreenBinding

class StartScreen : AppCompatActivity() {

    private lateinit var binding: ActivityStartScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@StartScreen, Login::class.java)
            startActivity(intent)
            finish()      }, 2500)
    }
}
