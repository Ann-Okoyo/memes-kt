package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PageThree : AppCompatActivity() {
    lateinit var btprevious: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagethree)
        var btfour: Button = findViewById(R.id.btfour)
btfour.setOnClickListener { val intent= Intent(this,PageThree::class.java);
    startActivity(intent)}

var btfive: Button = findViewById(R.id.btfive)
btfive.setOnClickListener { val intent= Intent(this,PageFour::class.java);
    startActivity(intent)}




}
}




//}

//class MainActivity : AppCompatActivity() {
////    lateinit var btnext : TextView
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
////        btnext= findViewById(R.id.btnext)

////        btnext.setOnClickListener {
////            val intent= Intent(this, NextPage::class.java)
////            startActivity(intent)
////        }
////    }
////}


//