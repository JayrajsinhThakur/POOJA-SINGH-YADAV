package com.example.currencyconverter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun secondscreen(navController: NavController) {

    Column (modifier = Modifier.fillMaxSize()
        .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally){

        Spacer(modifier = Modifier.padding(30.dp))

        Text(text = "Welcome to Currency Converter",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))


        Image(painter = painterResource(id = R.drawable.illustrator),
            contentDescription = "logo",
            modifier =  Modifier.padding(16.dp)
                .height(200.dp)
                .width(200.dp))

        Spacer(modifier = Modifier.padding(30.dp))

        Text(text = "Welcome to Currency Converter",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))


        Spacer(modifier = Modifier.padding(30.dp))

        Button(onClick = {
            navController.navigate("homescreen")
        },
            modifier = Modifier.padding(16.dp)
                .fillMaxWidth())
        {
            Text(text = "Get Started")

        }

    }

}