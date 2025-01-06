package com.example.progrmaningsimplifiedyt.Bootcamps.Components

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowAndColumn(modifier: Modifier = Modifier) {
    FlowRow(modifier = Modifier.fillMaxWidth()){
        repeat(20){
            Text(text = "Text $it",modifier.padding(20.dp))
        }
    }

}
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowAndColumn1(modifier: Modifier = Modifier) {
    FlowColumn(modifier = Modifier.fillMaxWidth()){
        repeat(20){
            Text(text = "Text $it",modifier.padding(20.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun flow() {
    FlowRowAndColumn1()
}
