package com.example.android.sample.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GenreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre)


     val button5 = findViewById<Button>(R.id.button5)
     val titleButton = findViewById<Button>(R.id.titleButton)
     val button6 = findViewById<Button>(R.id.button6)

     button5.setOnClickListener{
         finish()
     }

     titleButton.setOnClickListener() {
         val intent = Intent(this, TitleActivity::class.java)
         startActivity(intent)
     }

     button6.setOnClickListener(){
         val intent = Intent(this, TitleActivity::class.java)
         startActivity(intent)
     }

    }

}