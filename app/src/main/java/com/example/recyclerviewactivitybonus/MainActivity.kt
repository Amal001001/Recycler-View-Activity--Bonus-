package com.example.recyclerviewactivitybonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var location:EditText
    lateinit var phone:EditText
    lateinit var email:EditText
    lateinit var button: Button
    lateinit var info:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info = arrayListOf()
        name = findViewById(R.id.name)
        location = findViewById(R.id.location)
        phone = findViewById(R.id.phone)
        email = findViewById(R.id.email)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, recyclerActivity::class.java)
                info.add(name.text.toString())
                info.add(location.text.toString())
                info.add(phone.text.toString())
                info.add(email.text.toString())
            intent.putExtra("info",info)
            startActivity(intent)
        }

    }
}