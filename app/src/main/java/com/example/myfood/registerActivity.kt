package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class registerActivity : AppCompatActivity() {
    private lateinit var email: String
    private lateinit var password: String
    private lateinit var emailText: EditText
    private lateinit var passwordText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        // Find the button with id sign_i
        val sign_i = findViewById<Button>(R.id.sign_i)

        // Set an onClickListener for the sign_i button
        sign_i.setOnClickListener {
            // Create an Intent to start the profActiviti
            val intent1 = Intent(this@registerActivity, profActiviti::class.java)
            // Start the profActiviti
            startActivity(intent1)
        }

        //This is for get input and display
        emailText = findViewById(R.id.tx2)
        passwordText = findViewById(R.id.tx2)
        button = findViewById(R.id.g_register)

        button.setOnClickListener {
            get_register()
        }

    }

    //This is click get_register button and go display page
    private fun get_register() {
        email = emailText.text.toString().trim()
        password = passwordText.text.toString().trim()

        val intent = Intent(this@registerActivity, displayActivity::class.java)
        intent.putExtra(displayActivity.Email, email)
        intent.putExtra(displayActivity.Password, password)

        startActivity(intent)
    }

}
