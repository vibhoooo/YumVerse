package com.example.yumverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color(0xFFF2F2F2)
                    )
            ) {
                items(1)  {
                    Image(
                        painter = painterResource(id = R.drawable.happy_meal),
                        contentDescription = "Happy Meal",
                        modifier = Modifier
                            .height(300.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Fit
                    )
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "French Fries",
                            style = TextStyle(
                                fontSize = 26.sp
                            )
                        )
                        Spacer(
                            modifier = Modifier
                                .padding(10.dp)
                        )
                        Text(
                            text = "120 kcal",
                            style = TextStyle(
                                fontSize = 17.sp
                            )
                        )
                        Spacer(
                            modifier = Modifier
                                .padding(10.dp)
                        )
                        Text(
                            text = "Rs. 150",
                            style = TextStyle(
                                fontSize = 17.sp,
                                color = Color(0xFF85bb65)
                            )
                        )
                    }
                }
            }
        }
    }
}

