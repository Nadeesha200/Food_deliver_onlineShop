package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //This is click burger and go to burger page
        var txtburger = findViewById<TextView>(R.id.txtburger)
        txtburger.setOnClickListener {
            val intent1 = Intent(this@menuActivity, burgerActivity::class.java)
            startActivity(intent1)
        }

        //This is click pizza and go to pizza page
        var pizzbtn = findViewById<TextView>(R.id.pizzbtn)
        pizzbtn.setOnClickListener {
            val intent1 = Intent(this@menuActivity, pizzaActivity::class.java)
            startActivity(intent1)
        }

        //This is click dessert and go to dessert page
        var txtdessert = findViewById<TextView>(R.id.txtdessert)
        txtdessert.setOnClickListener {
            val intent1 = Intent(this@menuActivity, dessertActivity::class.java)
            startActivity(intent1)
        }

        //This is profile and go to profile page
        var img23 = findViewById<ImageView>(R.id.img23)
        img23.setOnClickListener {
            val intent1 = Intent(this@menuActivity, profActiviti::class.java)
            startActivity(intent1)
        }

    }
    // This is click burger and go to burger page
    fun burgerActivity(view: View) {}

    //This is click pizza and go to pizza page
    fun pizzaActivity(view: View) {}

    //This is click dessert and go to dessert page
    fun dessertActivity(view: View) {}

    //This is profile and go to profile page
    fun profActiviti(view: View) {}
}