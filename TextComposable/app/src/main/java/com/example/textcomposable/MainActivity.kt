package com.example.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textcomposable.ui.theme.TextComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting("Android")
                }
            }
        }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextComposableTheme {
        Greeting("Android")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier
    .width(80.dp)
    .height(240.dp)) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//another methods of resizing
//1. preferredWidth and preferredHeight
//2. size(width = 80.dp, height = 240.dp)
//3.size(80.dp) --> equal width and height

//4. Modifier.fillMaxSize() ----> Match Parent both
//5. Modifier.fillMaxWidth()---> MatchParent Width