package com.example.android.sample.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_anime_title.*

class AnimeTitleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anime_title)

        val nextButton = findViewById<Button>(R.id.nextButton)
        val baackButton = findViewById<Button>(R.id.backButton)

        nextButton.setOnClickListener(){
            val intent = Intent(this, GenreActivity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener(){
            val intent = Intent(this, TitleActivity::class.java)
            startActivity(intent)
        }
    }
}
