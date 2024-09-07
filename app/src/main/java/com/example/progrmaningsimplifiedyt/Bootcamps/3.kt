package com.example.progrmaningsimplifiedyt.Bootcamps

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ToDoScreen(modifier: Modifier = Modifier) {
    var todolist= remember {
        mutableStateListOf("bhavesh","saurabh","jayesh")
    }
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/todolist.add("new user") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
                
            }
        }

    ){
Column (modifier=Modifier.verticalScroll(rememberScrollState())){
todolist.forEach{
    Row( modifier= Modifier
        .padding(10.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = it)
        IconButton(onClick = { todolist.remove(it) }) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = null)
            
        }

    }
}
}
    }

}

@Preview(showBackground = true)
@Composable
private fun ToDoScreenPreview() {
ToDoScreen()
}
