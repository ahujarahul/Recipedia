package com.example.recipedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // with XML layouts
//        setContentView(R.layout.activity_main)

        // with Jetpack Compose
        // setContent block - defines the Activity's layout
        setContent {
            // column layout
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Greetings from Jetpack Compose!")
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(onClick = {
                    // handle button click here
                }) {
                    Text(text = "Click Me")
                }
            }
        }
    }
}