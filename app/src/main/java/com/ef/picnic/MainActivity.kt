package com.ef.picnic

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main)

        val btnRegister: Button = findViewById(R.id.signin)

        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterInput::class.java)
            startActivity(intent)
        }

        val btnEnter: Button = findViewById(R.id.signup)

        btnEnter.setOnClickListener {
            val intent = Intent(this, MainAppMenu::class.java)
            startActivity(intent)
        }

    }
}