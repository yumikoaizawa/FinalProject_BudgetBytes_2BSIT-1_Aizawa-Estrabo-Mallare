package com.labactivity.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.recyclerview.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {

    private lateinit var binding: ActivityAboutUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}