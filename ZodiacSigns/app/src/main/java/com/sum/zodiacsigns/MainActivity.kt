package com.sum.zodiacsigns


import android.os.Bundle
import android.window.SplashScreen
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

       installSplashScreen()
        //setTheme(R.style.Theme_ZodiacSigns)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)






    }
}