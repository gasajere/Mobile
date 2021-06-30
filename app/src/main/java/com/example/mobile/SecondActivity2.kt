package com.example.mobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnBack:Button
lateinit var btn2Next:Button
lateinit var btnCall:Button
class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        btnBack=findViewById(R.id.btnBack)
        btn2Next=findViewById(R.id.btn2Next)
        btnCall=findViewById(R.id.btnCall)

        btnCall.setOnClickListener {
            val intent=Intent(Intent.ACTION_DIAL)
            intent.setData((Uri.parse("tel:08125570218")))
            startActivity(intent)
        }

        btn2Next.setOnClickListener {
            Intent(this,ThirdActivity ::class.java).also {
                startActivity(it)
            }

        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}