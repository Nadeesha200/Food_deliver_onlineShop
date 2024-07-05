package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class successActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        //This is click Pay and go to success page
        var img2 = findViewById<ImageView>(R.id.img2)
        img2.setOnClickListener {
            val intent1 = Intent(this@successActivity, menuActivity::class.java)
            startActivity(intent1)
        }

        //This is click To_delivery and go to delivery page
        var delibtn = findViewById<Button>(R.id.delibtn)
        delibtn.setOnClickListener {
            val intent1 = Intent(this@successActivity, deliveryActivity::class.java)
            startActivity(intent1)
        }

    }
    //This is click Pay and go to success page
    fun menuActivity(view: View) {}

    //This is click To_delivery and go to delivery page
    fun deliveryActivity(view: View) {}
}