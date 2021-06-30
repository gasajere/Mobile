package com.example.mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText

class SignupActivity : AppCompatActivity() {
    private lateinit var btnApply: Button
    private lateinit var etFirstname: EditText
    private lateinit var etSurname: EditText
    private lateinit var etEmail: EditText
    private lateinit var etCountry: EditText
    private lateinit var etDate: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btnApply=findViewById(R.id.btnApply)
        etFirstname=findViewById(R.id.etFirstName)
        etSurname=findViewById(R.id.etSurname)
        etEmail=findViewById(R.id.etEmail)
        etDate=findViewById(R.id.etDate)
        etCountry=findViewById(R.id.etCountry)

        btnApply.setOnClickListener {
            val firstname = etFirstname.text.toString()
            val surname = etSurname.text.toString()
            val email = etEmail.text.toString()
            val country = etCountry.text.toString()
            val date = etDate.text.toString()
            Log.d(
                "SignupActivity",
                "$firstname $surname was born on $date, from $country with email:$email just applied"
            )
            Intent(this, SecondActivity2::class.java).also {
                startActivity(it)
            }

        }
    }
}