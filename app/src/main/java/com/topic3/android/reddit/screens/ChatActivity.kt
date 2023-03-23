package com.topic3.android.reddit.screens

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Button
import com.topic3.android.reddit.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.backButton.setOnClickListener {
            finish()
        }

        binding.button.setOnClickListener {
            showToast()
        }
    }

    private fun showToast() {
        Toast.makeText(this, "Imaginary chat started!", Toast.LENGTH_SHORT).show()
    }
}