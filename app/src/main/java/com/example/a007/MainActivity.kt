package com.example.a007

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a007.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
        }
        binding.edit.setOnClickListener {
            Toast.makeText(this, "EDIT", Toast.LENGTH_SHORT).show()
        }
    }
}