package com.example.buttonexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.buttonexamples.examples.ButtonWithBorder
import com.example.buttonexamples.examples.ButtonWithColor
import com.example.buttonexamples.examples.ButtonWithCutCornerShape
import com.example.buttonexamples.examples.ButtonWithElevation
import com.example.buttonexamples.examples.ButtonWithIcon
import com.example.buttonexamples.examples.ButtonWithRectangleShape
import com.example.buttonexamples.examples.ButtonWithRoundedCorner
import com.example.buttonexamples.examples.SimpleButton
import com.example.buttonexamples.ui.theme.ButtonExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonExamplesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        SimpleButton()
                        ButtonWithColor()
                        ButtonWithBorder()
                        ButtonWithElevation()
                        ButtonWithIcon()
                        ButtonWithRectangleShape()
                        ButtonWithCutCornerShape()
                        ButtonWithRoundedCorner()
                    }
                }
            }
        }
    }
}