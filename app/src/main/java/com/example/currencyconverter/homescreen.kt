package com.example.currencyconverter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun homescreen (){
    topcard()

}

@Composable
fun topcard (){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Blue)
        .padding(20.dp))
        {
            Column {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(16.dp)
                            .size(50.dp)
                            .clip(CircleShape)
                    )

                    Spacer(Modifier.width(5.dp))

                    Column {
                        Text("Good Morning",
                            color = Color.White)
                        Text("Alex Walker",
                            color = Color.White)

                    }

                    Box{
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "notifications",
                            tint = Color.White,
                            modifier = Modifier.padding(5.dp)
                        )

                        Spacer(Modifier.width(12.dp))

                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "notifications",
                            tint = Color.White,
                            modifier = Modifier.padding(10.dp)
                        )
                    }

                }

                Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ){
                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            shape = RoundedCornerShape(30.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("WITHDRAW" , color = Color.White)
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            shape = RoundedCornerShape(30.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("DEPOSIT" , color = Color.White)
                        }

                    }
            }
        }

}