package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class dessertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)

        //This is click List and go to menu page
        var list2 = findViewById<ImageView>(R.id.list2)
        list2.setOnClickListener {
            val intent1 = Intent(this@dessertActivity, menuActivity::class.java)
            startActivity(intent1)
        }

        //This is click profile and go to profile page
        var profi2 = findViewById<ImageView>(R.id.profi2)
        profi2.setOnClickListener {
            val intent1 = Intent(this@dessertActivity, profActiviti::class.java)
            startActivity(intent1)
        }

        //This is click Add and go to Payment page
        var btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val intent1 = Intent(this@dessertActivity, cardActivity1::class.java)
            startActivity(intent1)
        }

    }

    //This is click List and go to Menu page
    fun menuActivity(view: View) {}

    //This is click profile and go to profile page
    fun profActiviti(view: View) {}

    //This is click Add and go to Payment page
    fun cardActivity1(view: View) {}
}