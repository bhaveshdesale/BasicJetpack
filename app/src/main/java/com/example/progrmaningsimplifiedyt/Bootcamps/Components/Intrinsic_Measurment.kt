package com.example.progrmaningsimplifiedyt.Bootcamps.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IntrinsicMeasurementExample(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .height(IntrinsicSize.Min)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Hi this is \n instrinsic \nkfjdjasfjajas\njfdakfalkalkf text")
            VerticalDivider(modifier = Modifier
                .fillMaxHeight()
                .width(1.dp))
            Text(text = "Hi This is \n instrinsic text2\n jtkdsja ilfjajfaj fjlsdjfkla")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun IntrinsicMeasurementExample1() {
    IntrinsicMeasurementExample()

}