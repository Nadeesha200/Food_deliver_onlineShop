package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfood.R.*

class displayActivity : AppCompatActivity() {

    companion object {
        const val Email = "Email"
        const val Password = "Password"
    }

    private lateinit var emailText: TextView
    private lateinit var passwordText: TextView
    private lateinit var email: String
    private lateinit var password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_display)

        emailText = findViewById(R.id.tx2)
        passwordText = findViewById(R.id.tx2)

        val intent = intent
        email = intent.getStringExtra(Email) ?: ""
        password = intent.getStringExtra(Password) ?: ""

        emailText.text = "Your Mail: $email"
        passwordText.text = "This is Password: $password"


        //This is Click Next and go to menuActivity page
        var nextbtn = findViewById<Button>(R.id.nextbtn)
        nextbtn.setOnClickListener {
            val intent1 = Intent(this@displayActivity, menuActivity::class.java)
            startActivity(intent1)
        }
    }

    //This is Click Next and go to menuActivity page
    fun menuActivity(view: View) {}
}
