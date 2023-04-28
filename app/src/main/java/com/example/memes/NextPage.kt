package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextPage : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextpage)

        var prev1: Button = findViewById(R.id.prev1)
        prev1.setOnClickListener { val intent= Intent(this,MainActivity::class.java);
            startActivity(intent)}

        var btstart2: Button = findViewById(R.id.btstart2)
        btstart2.setOnClickListener { val intent= Intent(this,PageThree::class.java);
            startActivity(intent)}




        }
}


