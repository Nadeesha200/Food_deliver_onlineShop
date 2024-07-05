package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class correctActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct)

        //This is click Home and go to logoActivity page
        var btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {
            val intent1 = Intent(this@correctActivity, logoActivity::class.java)
            startActivity(intent1)
        }
    }

    //This is click Home and go to logoActivity page
    fun logoActivity(view: View) {}
}