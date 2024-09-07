package com.example.progrmaningsimplifiedyt.Bootcamps

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Lazy() {
    //if you have to pass composable function inside another function then parent composable function should be contain last parameter compasable functon
    LazyColumn(modifier=Modifier.fillMaxSize(),
        contentPadding = PaddingValues(20.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            (1..100).forEach {
            Text(text = "Hello",modifier=Modifier.padding(20.dp))
        }
    }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyPreview() {
    Lazy()
}