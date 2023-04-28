package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btstart1: Button = findViewById(R.id.btstart1)
        btstart1.setOnClickListener { val intent= Intent(this,NextPage::class.java);
            startActivity(intent)}


        }
    }

//
//var btnNxt1: Button = findViewById(R.id.btnNxt1)
//btnNxt1.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
//    startActivity(intent)}
//var btnprev: Button = findViewById(R.id.btnprev)
//btnprev.setOnClickListener { val intent= Intent(this,MainActivity::class.java);
//    startActivity(intent)}





