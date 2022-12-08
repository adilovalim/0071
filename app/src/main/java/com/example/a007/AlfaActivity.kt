package com.example.a007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.a007.databinding.ActivityAlfaBinding

class AlfaActivity : AppCompatActivity() {
    lateinit var binding :ActivityAlfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlfaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /////////////////////////////
        val windowInsetsController =
            WindowCompat.getInsetsController(window, window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.statusBars())
        // full ekran qlish
        //////////////////////////////

        val navController = Navigation.findNavController(this,R.id.fragmentContainerView)
        setupWithNavController(binding.bottomNaw, navController)
    }
}