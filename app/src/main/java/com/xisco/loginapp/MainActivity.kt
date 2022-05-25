package com.xisco.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)

                        supportFragmentManager.beginTransaction().replace(R.id.nav_container, OnboardingFragment()).commit()
            }
}