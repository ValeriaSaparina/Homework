package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController
        findViewById<BottomNavigationView>(R.id.bnv_main).apply {
            Log.e("CHECK", findViewById<BottomNavigationView>(R.id.bnv_main).toString())
            setupWithNavController(controller)
        }
    }
}