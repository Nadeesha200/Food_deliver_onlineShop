package com.example.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class profActiviti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prof_activiti)

        var gobtn = findViewById<Button>(R.id.gobtn)
        gobtn.setOnClickListener {
            val intent1 = Intent(this@profActiviti, menuActivity::class.java)
            startActivity(intent1)
        }
    }
    fun menuActivity(view: View) {}
}