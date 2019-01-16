package com.example.android.sample.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var undobtn = findViewById<Button>(R.id.undoButton)
        undobtn.setOnClickListener {
            finish()
        }

        var titlebtn = findViewById<Button>(R.id.titleButton)
        titlebtn.setOnClickListener {
            intent = Intent(this, TitleActivity::class.java)
            startActivity(intent)
        }

        var nextbtn = findViewById<Button>(R.id.nextButton)

        var resultbtn = findViewById<Button>(R.id.resultButton)
        resultbtn.setOnClickListener {
            intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}
