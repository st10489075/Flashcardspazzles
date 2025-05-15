package com.example.flashcardspazzles

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.flashcardspazzles.ui.theme.FlashcardsPazzlesTheme

class Flashcards : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Array for questions
        val questions = arrayOf("question 1-Mandela was the first president in South Africa?",
            "question 2-The ancient Egyptians built over 100 pyramids along the Nile River?",
            "question 3-Michelle Obama served as the First Lady of England from 2009 to 2017?",
            "question 4-World War I began in 1914 and ended in 1989?",
            "question 5-South Africa has never experienced Apartheid in the 1948?")

        //Array for answers
        val answers = arrayOf("True","False","False","True","False")

        //Variable to store the score
        var score = 0

        var index =0 
        var user_response = "False"
        
        super.onCreate(savedInstanceState)
        setContent {
            var currentQuestion by remember {
                mutableStateOf ( questions [index])
            }
            var feedback by remember {
                mutableStateOf ( "")
            }




            Column {
                Text(text = "Flashcards")
                
                Text(text = currentQuestion)

                Text(text = feedback)


                Row {

                    Button(
                        onClick = {
                            if (answers[index]=="True") {
                                score++
                                feedback= "Correct"
                            }
                            else{
                                feedback= "Incorrect"
                            }

                        })
                    {
                        Text(text = "True")


                    }
                    Button(onClick = {
                        if (answers[index]=="False") {
                            score++
                            feedback="Correct"
                        }
                        else{
                            feedback="Incorrect"
                        }

                    }) {
                        Text(text = "False")

                    }
                }

                Button(onClick = {

                    if (index < questions.size-1){
                        index++
                        currentQuestion=questions[index]
                        feedback= ""

                    } else {
                        val next = Intent(this@Flashcards, ScoreDisplay::class.java)
                        next.putExtra("score",score)
                        startActivity(next)


                    }


                }) {
                    Text(text = "Next")


                }


        }


            }
        }
    }


