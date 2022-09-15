package com.example.fintech1832_response2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_login )

        val btnLogin: Button = findViewById( R.id.btn_login )
        btnLogin.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            startActivity( intent )
        }
    }

    fun txt_register( view: View) {
        val intent = android.content.Intent( this, RegisterActivity::class.java )
        startActivity( intent )
    }
    fun txt_recovery( view: View) {
        val intent = android.content.Intent( this, RecoveryActivity::class.java )
        startActivity( intent )
    }
}