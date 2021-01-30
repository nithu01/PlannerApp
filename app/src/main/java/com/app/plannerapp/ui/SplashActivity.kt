package com.app.plannerapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.app.plannerapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        var handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                var intent = Intent(this@SplashActivity,MainActivity::class.java)
                startActivity(intent)

            }
        }, 6000)


    }

}