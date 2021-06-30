package com.example.mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity





class MainActivity : AppCompatActivity() {
    val validusername:String="admin"
    val validpassword:String="1234"

    private lateinit var btnLogin: Button
    private lateinit var btnsignup:Button
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput=findViewById(R.id.usernameinput)
        passwordInput=findViewById(R.id.passwordinput)
        btnsignup=findViewById(R.id.btnsignup)

        btnLogin=findViewById(R.id.btnLogin)
        btnsignup.setOnClickListener {
            Intent(this,SignupActivity::class.java).also {
                startActivity(it)
            }
        }



        btnLogin.setOnClickListener{
            val username=usernameInput.text.toString()
            val password=passwordInput.text.toString()

            login(username,password)
            }


        }

    private fun login(username:String,password: String){
        if (validate(username, password)){
            val intent:Intent=Intent(this, SecondActivity2::class.java)
            intent.putExtra("name",username)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext,"an error occured, please check",Toast.LENGTH_SHORT).show()
        }

    }
    private fun validate(username: String, password: String): Boolean {
        if (username ==validusername && password == validpassword) return true
        return false
    }
    }
