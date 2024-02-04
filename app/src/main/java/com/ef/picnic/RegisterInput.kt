package com.ef.picnic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (_: NullPointerException) {
        }
        setContentView(R.layout.activity_register_input)

        val btnRegister: Button = findViewById(R.id.signinReg)

        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterFinish::class.java)
            startActivity(intent)
        }
    }
}