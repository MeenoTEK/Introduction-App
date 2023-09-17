package com.meenotek.introduction

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val twitterImageView = findViewById<ImageView>(R.id.twitterImageView)
        val linkedinImageView = findViewById<ImageView>(R.id.linkedinImageView)
        val hireMeButton = findViewById<Button>(R.id.hireMeButton)

        twitterImageView.setOnClickListener {
            // Handle click for Twitter icon (open Twitter profile)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/lilmeeno"))
            startActivity(intent)
        }

        linkedinImageView.setOnClickListener {
            // Handle click for LinkedIn icon (open LinkedIn profile)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ameen-shokoya-29358620a"))
            startActivity(intent)
        }

        hireMeButton.setOnClickListener {
            // Handle click for "Hire Me" button (open email intent)
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("shokoya01@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Job Inquiry")
            startActivity(Intent.createChooser(intent, "Send Email"))
        }
    }
}
