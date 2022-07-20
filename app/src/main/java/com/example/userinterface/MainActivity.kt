package com.example.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonFood:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonFood=findViewById(R.id.Btn_Food)

        ButtonFood!!.setOnClickListener {
            val intent=Intent(this,Food::class.java)
            startActivity(intent)

        }
    }
}