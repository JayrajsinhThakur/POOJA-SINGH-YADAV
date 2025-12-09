package com.example.currencyconverter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun historyscreen() {

    Column (modifier = Modifier.fillMaxSize()
        .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "History",
            color = Color.Black,
            fontSize = 30.sp)

        Text(text = "Collapse",
            color = Color.Black,
            fontSize = 30.sp)




        )}
    }

