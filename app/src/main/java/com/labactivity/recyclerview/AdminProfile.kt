package com.labactivity.recyclerview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.recyclerview.databinding.ActivityAdminProfileBinding

class AdminProfile : AppCompatActivity() {

    private lateinit var binding: ActivityAdminProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aboutusBtn.setOnClickListener {
            val intent = Intent(this@AdminProfile, AboutUs::class.java)
            startActivity(intent)
        }

        binding.logoutBtn.setOnClickListener {
            Toast.makeText(this, "Logging Out...", Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                val intent = Intent(this@AdminProfile, Login::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }
    }
}
