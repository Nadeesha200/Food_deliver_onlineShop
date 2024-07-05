package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class deliveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery)

        //This is click Submit and go to correctActivity page
        var btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            val intent1 = Intent(this@deliveryActivity, correctActivity::class.java)
            startActivity(intent1)
        }

        //This is click List and go to Menu page
        var img4 = findViewById<ImageView>(R.id.img4)
        img4.setOnClickListener {
            val intent1 = Intent(this@deliveryActivity, menuActivity::class.java)
            startActivity(intent1)
        }

    }

    //This is click Submit and go to correctActivity page
    fun correctActivity(view: View) {}

    //This is click List and go to Menu page
    fun menuActivity(view: View) {}
}