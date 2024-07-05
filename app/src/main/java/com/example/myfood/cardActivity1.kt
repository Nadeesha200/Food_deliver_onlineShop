package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cardActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card1)

        //This is click Pay and go to success page
        var btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            val intent1 = Intent(this@cardActivity1, successActivity::class.java)
            startActivity(intent1)
        }

    }

    //This is click Pay and go to success page
    fun successActivity(view: View) {}
}