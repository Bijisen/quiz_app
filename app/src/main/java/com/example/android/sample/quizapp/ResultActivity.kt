package com.example.android.sample.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val titlebtn = findViewById<Button>(R.id.titleButton)
        titlebtn.setOnClickListener {
            intent = Intent(this, TitleActivity::class.java)
            startActivity(intent)
        }

        val resultbtn = findViewById<Button>(R.id.anime_titleButton)
        resultbtn.setOnClickListener {
            intent = Intent(this, AnimeTitleActivity::class.java)
            startActivity(intent)
        }

        val janru_btn = findViewById<Button>(R.id.janru_button)
        resultbtn.setOnClickListener {
            intent = Intent(this, GenreActivity::class.java)
            startActivity(intent)
        }
    }
}
