package com.example.progrmaningsimplifiedyt.Bootcamps

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.progrmaningsimplifiedyt.R

/*
@Composable
fun ButtonLayout(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Button(onClick = { Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show() }
    ,modifier=Modifier, elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
colors = ButtonDefaults.buttonColors(
    containerColor = Color.Black
)
        ) {
        Text(text = "Simple Button",
            modifier = Modifier)

    }
}
@Preview
@Composable
fun ButtonPreview(modifier: Modifier = Modifier) {
    ButtonLayout()
}*/
@Composable
fun ImageCom(modifier: Modifier = Modifier) {
   Image(imageVector = Icons.Default.AccountBox, contentDescription =null,Modifier.sizeIn(200.dp,200.dp))
}

@Preview
@Composable
private fun ImagePreview() {
ImageCom()
}
