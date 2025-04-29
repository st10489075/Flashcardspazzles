package com.example.flashcardspazzles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcardspazzles.ui.theme.FlashcardsPazzlesTheme

class ScoreDisplay : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        
        var score = intent.getIntExtra("score", -1)
        
        super.onCreate(savedInstanceState)
        setContent {

            Text(text = "Score: "+ score)

            if( score == 0 ){

            }


        }
    }
}
