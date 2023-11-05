package com.example.composebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebusinesscard.ui.theme.ComposeBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreateBusinessCard()
                }
            }
        }
    }
}


@Composable
fun CreateBusinessCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp))
        ) {
//here  will add the card components


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                createImageProfile()
            }
        }
    }

}

@Composable
private fun createImageProfile() {
    Surface(
        modifier = Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape, border = BorderStroke(0.5.dp, Color.DarkGray)
    ) {



        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "profile photo",
            modifier = Modifier.size(140.dp),
            contentScale = ContentScale.Crop
        )

        Text(text = "Android Developer @ Etisalat Egypt")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBusinessCardTheme {
        CreateBusinessCard()
    }
}