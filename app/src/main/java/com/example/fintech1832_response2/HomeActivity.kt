package com.example.fintech1832_response2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_home )
    }
}