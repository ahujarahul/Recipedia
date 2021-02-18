package com.example.recipedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContent block - defines the Activity's layout
        setContent {
            Column {
                // filling up last param. values of the Column lambda function
                Image(bitmap = imageFromResource(resources, R.drawable.happy_meal),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center)

                // padding for all sides of the column
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "McDonald's Happy Meal",
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        style = TextStyle(fontSize = 24.sp))
                    Spacer(modifier = Modifier.padding(top = 8.dp))
                    Text(text = "\$5.99",
                        color = Color(0xFF009900),
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(fontSize = 16.sp))
                    // space between the text
                    Spacer(modifier = Modifier.padding(top = 8.dp))
                    Text(text = "650 Calories")
                    Spacer(modifier = Modifier.padding(top = 8.dp))
                }
            }
        }
    }
}