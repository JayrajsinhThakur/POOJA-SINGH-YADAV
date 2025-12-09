package com.example.currencyconverter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun homescreen (navController:  NavController){
    Column {

        topcard(navController)
        Column (modifier = Modifier
            .height(100.dp)
            .padding(10.dp),
        ) {
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Text(
                    text = "History",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Start

                )

                Text(
                    text = "Expand",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.End
                )

            }
        }
        showlisthistory()
    }
}

// funtion for displaying the list
@Composable
fun showlisthistory() {
    LazyColumn {
        items(100) { index ->
            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(100.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(16.dp)
                            .height(80.dp)
                            .width(80.dp)
                    )

                    Column {
                        Text(
                            text = "ID2133321",
                            color = Color.Black,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .weight(1f)
                                .padding(10.dp),
                            textAlign = TextAlign.Start

                        )

                        Text(
                            text = "12 april 2024",
                            color = Color.Black,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f).padding(2.dp),
                            textAlign = TextAlign.Start
                        )
                    }

                    Text(
                        text = "$24",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .weight(1f)
                            .padding(10.dp),
                        textAlign = TextAlign.End
                    )

                }
            }
        }
    }
}

@Composable
fun topcard (navController: NavController){
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

                ) { Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(16.dp)
                            .size(50.dp)
                            .clip(CircleShape)
                    )

                    Spacer(Modifier.width(5.dp))

                    Column {
                        Text(
                            "Good Morning",
                            color = Color.White
                        )
                        Text(
                            "Alex Walker",
                            color = Color.White
                        )

                    }
                }

                    Row {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "notifications",
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )

                        Spacer(Modifier.width(5.dp))

                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "notifications",
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )
                    }

                }

                Spacer(modifier = Modifier.height(10.dp))

                Text("Available Balance",
                    color = Color.White)
                Text("24,224,90",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)


                Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ){
                        Button(onClick = {
                            navController.navigate("historyscreen") },
                            colors = ButtonDefaults.buttonColors(Color.White),
                            shape = RoundedCornerShape(30.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("WITHDRAW" , color = Color.Black)
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Button(onClick = {
                            navController.navigate("lastscreen") },
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