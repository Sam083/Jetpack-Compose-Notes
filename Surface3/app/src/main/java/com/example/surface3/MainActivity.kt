package com.example.surface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    //Parent Layout
    //match parent on width and height
    Surface(color = Color.DarkGray,
        modifier = Modifier.fillMaxSize(),
    ){

        Row() {

            Surface(color = Color.Red,
                modifier = Modifier.fillMaxHeight()
                    .width(60.dp)) { }
            Surface(color = Color.White,
                modifier = Modifier.fillMaxHeight()
                    .width(60.dp)) { }
            Surface(color = Color.Green,
                modifier = Modifier.fillMaxHeight()
                    .width(60.dp)) { }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}