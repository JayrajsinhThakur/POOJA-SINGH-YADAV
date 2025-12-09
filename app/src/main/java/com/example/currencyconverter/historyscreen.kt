package com.example.currencyconverter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun historyscreen() {

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(25.dp),
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

            Text(text = "Collapse",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.End)

        }

       showlist()

    }
}

@Composable
fun showlist(){

    LazyColumn {
        items(100){index->
            Card (modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(100.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){

                Row {
                    Image(painter = painterResource(id = R.drawable.logo),
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
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Start
                        )
                    }





                    Text(text = "$24",
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .weight(1f)
                            .padding(10.dp),
                        textAlign = TextAlign.End)

                }
                }
            }

        }
}

