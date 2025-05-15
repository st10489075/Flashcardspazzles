package com.example.flashcardspazzles

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flashcardspazzles.ui.theme.FlashcardsPazzlesTheme

class ScoreDisplay : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        
        var score = intent.getIntExtra("score", -1)
        
        super.onCreate(savedInstanceState)
        setContent {

            var feedback by remember{
                mutableStateOf("")

            }

            Text(text = "Score: "+ score)

            if( score == 0 ){
                feedback = "You did not try at all"
            }
            if (score <3 ) {
                feedback = "You tried"
            }else{
                feedback = "Job well done"
            }
            if (score >=6 ){
                feedback= "Invalid score"
            }

            Text(text = feedback )

            Spacer(modifier = Modifier.size(30.dp))

            Text(text = "Press the button below to review work")

            Spacer(modifier = Modifier.size(30.dp))

            Button(
                onClick = {

                    val next = Intent(this@ScoreDisplay, ReviewThePuzzels::class.java)
                    startActivity(next)

             })

            {
                Text(text = "Review your work")
            }



        }
    }
}
