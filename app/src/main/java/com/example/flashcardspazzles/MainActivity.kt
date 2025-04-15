package com.example.flashcardspazzles

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcardspazzles.ui.theme.FlashcardsPazzlesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column {
                Text(text = "Flashcards pazzels")

                Text(text = "press a button to begin the pazzels")

                Button(
                    onClick = {
                        //Run when  button clicked
                        val next = Intent(this@MainActivity, Flashcards::class.java)
                        startActivity(next)

                    })

                {

                    Text(text = "Start")

                }


            }



        }
    }
}


