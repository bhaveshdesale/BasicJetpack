package com.example.progrmaningsimplifiedyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.text.BasicTextField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           // ProgrmaningSimplifiedYtTheme {
                //MyScaffold()
              //  HorizontalPagerScreen()
//ToDoScreen()
          //BasicTextField()
            }
        }
    }


