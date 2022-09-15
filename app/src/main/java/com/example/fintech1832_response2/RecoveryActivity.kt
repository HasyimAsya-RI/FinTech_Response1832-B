package com.example.fintech1832_response2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_recovery )

        val btnRecovery: Button = findViewById( R.id.btn_recovery )
        btnRecovery.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }
    }

    fun img_back( view: View) {
        val intent = android.content.Intent( this, LoginActivity::class.java )
        startActivity( intent )
    }
}