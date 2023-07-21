package com.example.buttonexamples.examples

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWithRectangleShape() {
    Button(
        onClick = { /*TODO*/ },
        shape = RectangleShape
    ) {
        Text("Rectangle Shape Button")
    }
}

@Composable
fun ButtonWithRoundedCorner() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(text = "Rounded Corner shape")
    }
}

@Composable
fun ButtonWithCutCornerShape() {
    Button(
        onClick = { /*TODO*/ },
        shape = CutCornerShape(10)
    ) {
        Text(text = "Cut Corner Shape")
    }
}