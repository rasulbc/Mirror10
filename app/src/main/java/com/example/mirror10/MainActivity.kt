package com.example.mirror10

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signupButton.setOnClickListener{
            val intent = Intent(this,signupActivity::class.java)
            startActivity(intent)
        }

        signupButton.setOnClickListener{
            val intent = Intent(this,signinActivity::class.java)
            startActivity(intent)
        }
    }
}
