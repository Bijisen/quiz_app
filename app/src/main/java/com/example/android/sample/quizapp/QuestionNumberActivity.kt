package com.example.android.sample.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_anime_title.*
import kotlinx.android.synthetic.main.activity_question.*

class QuestionNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_number)

        val nextButton = findViewById<Button>(R.id.nextButton)
        val backButton = findViewById<Button>(R.id.backButton)
        val titleButton = findViewById<Button>(R.id.titleButton)

        nextButton.setOnClickListener(){
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener(){
            val intent = Intent(this, GenreActivity::class.java)
            startActivity(intent)
        }

        titleButton.setOnClickListener(){
            val intent = Intent(this, TitleActivity::class.java)
            startActivity(intent)
        }
    }
}
