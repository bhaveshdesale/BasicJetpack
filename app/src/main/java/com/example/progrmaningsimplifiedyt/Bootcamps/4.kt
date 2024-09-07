package com.example.progrmaningsimplifiedyt.Bootcamps

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BasicTextField(modifier: Modifier = Modifier) {
    var text1= buildAnnotatedString {
        withStyle(style = SpanStyle(
            color = Color.Red,
            fontSize = 30.sp


        )){
            append("B")
        }
        append("havesh")
    }
    var username by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {


    TextField(value = username, onValueChange = {
        username=it
    },modifier=Modifier,
    label = {
        Text("Username")
    },
        leadingIcon = {
            Icon(Icons.Default.AccountCircle, contentDescription = null)
        },
        placeholder = {
            Text("Enter your username")
        },
        visualTransformation =PasswordVisualTransformation()


        )
        Text(text = text1)
}




}

@Preview
@Composable
private fun BasicTextFieldPreview() {
    BasicTextField()
}