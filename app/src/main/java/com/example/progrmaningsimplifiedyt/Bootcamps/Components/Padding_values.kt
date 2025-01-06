package com.example.progrmaningsimplifiedyt.Bootcamps.Components

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Paddingvalues(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "AppBar", color = Color.Black) }, colors = TopAppBarDefaults.topAppBarColors(
                Cyan))
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray,
            ) {
                Icon(imageVector = Icons.Default.Home, contentDescription = null,Modifier.padding(horizontal = 50.dp))
                Icon(imageVector = Icons.Default.Home, contentDescription = null,Modifier.padding(horizontal = 50.dp))
                Icon(imageVector = Icons.Default.Home, contentDescription = null,Modifier.padding(horizontal = 50.dp))


            }
        }


    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            LazyColumn() {
                items(50) {
                    Text(text = "Text $it")

                }
            }
            FloatingActionButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.BottomEnd)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription =null )

            }
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun padding1() {
    Paddingvalues()

}