package com.example.buttonexamples.examples

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWithElevation() {
    Button(
        onClick = { /*TODO*/ },
        elevation = ButtonDefaults.buttonElevation(
            pressedElevation = 15.dp,
            defaultElevation = 10.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = "Button With Elevation")
    }
}