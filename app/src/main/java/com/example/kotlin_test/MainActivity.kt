package com.example.kotlin_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateText()

        add.setOnClickListener {
            counter ++
            updateText()
        }

        minus.setOnClickListener {view ->
            if(counter <= 0)
                Snackbar.make(
                    view, // Parent view
                    "The counter can not be less than zero", // Message to show
                    Snackbar.LENGTH_SHORT // How long to display the message.
                ).show()
            else {
                counter --
                updateText()
            }
        }
    }

    private fun updateText() {
        text_counter.text = getString(R.string.counter, counter)
    }

}
