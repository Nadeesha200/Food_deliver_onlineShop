package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class pizzaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        //This is click List and go to menu page
        var list1 = findViewById<ImageView>(R.id.list1)
        list1.setOnClickListener {
            val intent1 = Intent(this@pizzaActivity, menuActivity::class.java)
            startActivity(intent1)
        }

        //This is click profile and go to profile page
        var profi1 = findViewById<ImageView>(R.id.profi1)
        profi1.setOnClickListener {
            val intent1 = Intent(this@pizzaActivity, profActiviti::class.java)
            startActivity(intent1)
        }

        //This is click Add_To and go to Payment page
        var btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            val intent1 = Intent(this@pizzaActivity, cardActivity1::class.java)
            startActivity(intent1)
        }


    }

    //This is click List and go to Menu page
    fun menuActivity(view: View) {}

    //This is click profile and go to profile page
    fun profActiviti(view: View) {}

    //This is click Add_To and go to Payment page
    fun cardActivity1(view: View) {}

}