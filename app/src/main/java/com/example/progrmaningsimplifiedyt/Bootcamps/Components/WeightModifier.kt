package com.example.progrmaningsimplifiedyt.Bootcamps.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WeightModifierExample(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Row (modifier=Modifier.fillMaxWidth()){
            Text(
                text = "Hello this is weight modifier and this is new composable function",
                modifier = Modifier.weight(
                    1f,
                    
                )
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Hello")
                
            }
            
        }
    }
    
}
@Preview
@Composable
private fun Weight2() {
    new()
}
@Composable
fun new(modifier: Modifier = Modifier) {
    Box(modifier=Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            text = "Hi this is bhavesh this side and he will gonna become the coder",

        )
        Button(onClick = {}) {
            Text(text = "Click")
        }
    }
    
}

@Preview(showBackground = true)
@Composable
private fun Weight() {
    WeightModifierExample()
    

}

@Composable
fun Two(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center, ){
        Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = { /*TODO*/ },modifier= Modifier
                .fillMaxWidth()
                .weight(0.5f)) {
                Text(text = "Button1")
                
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { /*TODO*/ },modifier= Modifier
                .fillMaxWidth()
                .weight(0.5f)) {
                Text(text = "Button2")
                
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun twoq() {
Two()
}

@Composable
fun Lazycolumn(modifier: Modifier = Modifier) {
    Column(modifier=Modifier.fillMaxSize()) {
LazyColumn(modifier=Modifier.weight(1f)) {
    items(50) {
        Text(text = "Text $it", modifier=Modifier.padding(10.dp))
    }
}
        Button(onClick = { /*TODO*/ },modifier= Modifier
            .padding(10.dp)
            .fillMaxWidth()) {
            Text(text = "Get Started")
        }
    }
    
}

@Preview(showBackground = true)
@Composable
private fun PreviewLazycolumn() {
    Lazycolumn()

    
}