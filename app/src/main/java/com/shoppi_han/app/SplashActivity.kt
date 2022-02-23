package com.shoppi_han.app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       startActivity(Intent(this, MainActivity::class.java))
        finish() // 스플래쉬 액티비티를 종료시키기 위함

       /* Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            //intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        },DURATION)*/
    }
    companion object {
        private const val DURATION : Long = 1500
    }
}