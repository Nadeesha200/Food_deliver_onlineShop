package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class logoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        var start__btn = findViewById<Button>(R.id.start__btn)
        start__btn.setOnClickListener {
            val intent1 = Intent(this@logoActivity, registerActivity::class.java)
            startActivity(intent1)
        }
    }

    fun registerActivity(view: View) {}
}