package com.example.fintech1832_response2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        val btnNext: Button = findViewById( R.id.btn_next )
        btnNext.setOnClickListener {
            val intent = Intent( this, LoginActivity::class.java )
            startActivity( intent )
        }
    }
}