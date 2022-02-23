package com.shoppi_han.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*supportFragmentManager.beginTransaction()
            .add(R.id.frameLayout, HomeFragment()).commit()*/

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation_main)
        bottomNavigationView.itemIconTintList = null

        // 바텀 내비게이션과 fragment containerdml NavHostFragment를 연결
        val navController = supportFragmentManager.findFragmentById(R.id.container_main)?.findNavController()
        navController?.let{
            // null 이 아닌 경우
            bottomNavigationView.setupWithNavController(it)
        }

    }
}