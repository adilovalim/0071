package com.example.a007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.a007.databinding.ActivitySpleshBinding

class SpleshActivity : AppCompatActivity() {
    lateinit var handler: Handler
    lateinit var binding: ActivitySpleshBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpleshBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val windowInsetsController =
            WindowCompat.getInsetsController(window, window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())

        binding.progressBar.progress = 0
        handler = Handler(mainLooper)
        handler.postDelayed(runnable, 1000)
    }
    var runnable = object : Runnable {
        override fun run() {
            binding.progressBar.progress += 50
            handler.postDelayed(this, 1000)
            if (binding.progressBar.progress == 100){
                val intent = Intent(this@SpleshActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
                handler.removeCallbacks(this)
            }



        }
    }
}