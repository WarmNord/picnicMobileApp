package com.ef.picnic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterFinish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (_: NullPointerException) {
        }
        setContentView(R.layout.activity_register_finish)

        val btnRegisterFinish: Button = findViewById(R.id.Continue)

        btnRegisterFinish.setOnClickListener {
            val intent = Intent(this, MainAppMenu::class.java)
            startActivity(intent)
        }
    }
}