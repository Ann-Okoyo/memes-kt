package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_four)
        var btsix: Button = findViewById(R.id.btsix)
        btsix.setOnClickListener { val intent= Intent(this,PageFour::class.java);
            startActivity(intent)}

        var btseven: Button = findViewById(R.id.btseven)
        btseven.setOnClickListener { val intent= Intent(this,PageFive::class.java);
            startActivity(intent)}




    }
}
//


