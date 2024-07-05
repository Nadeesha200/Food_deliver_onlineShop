package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class burgerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)

        //This is click List and go to Menu page
        var listimg = findViewById<ImageView>(R.id.listimg)
        listimg.setOnClickListener {
            val intent1 = Intent(this@burgerActivity, menuActivity::class.java)
            startActivity(intent1)
        }

        //This is click profile and go to profile page
        var proimg = findViewById<ImageView>(R.id.proimg)
        proimg.setOnClickListener {
            val intent1 = Intent(this@burgerActivity, profActiviti::class.java)
            startActivity(intent1)
        }

        //This is click Add_To_Card and go to Payment page
        var btn1 = findViewById<Button>(R.id.btn2)
        btn1.setOnClickListener {
            val intent1 = Intent(this@burgerActivity, cardActivity1::class.java)
            startActivity(intent1)
        }


    }
    //This is click List and go to Menu page
    fun menuActivity(view: View) {}

    //This is click profile and go to profile page
    fun profActiviti(view: View) {}

    //This is click Add_To_Card and go to Payment page
    fun cardActivity1(view: View) {}
}