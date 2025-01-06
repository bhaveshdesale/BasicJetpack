package com.example.progrmaningsimplifiedyt.Bootcamps.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ToggleModifierFun(modifier: Modifier = Modifier) {
    var isChecked by remember{
        mutableStateOf(false)
    }

Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center,
    ){
    Row(modifier= Modifier
        .fillMaxWidth()
        .align(Alignment.Center)

        .toggleable(
            value = isChecked,
            onValueChange = {
                isChecked = true
            },
            role = Role.Checkbox,


            )  ,  horizontalArrangement = Arrangement.SpaceAround) {
        Text(text = "Checkbox",modifier=Modifier.weight(1f).padding(start=100.dp))
        Checkbox(modifier = Modifier.padding(end = 30.dp),
            checked = isChecked,
            onCheckedChange = {
                isChecked = it
            }
        )
    }
}
}

@Preview(showBackground = true)
@Composable
private fun toggle() {
    ToggleModifierFun()

}