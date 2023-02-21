package com.example.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .width(200.dp)
            .height(240.dp)
            .clickable (onClick = {}) //order matters
            .padding(20.dp),
        style = MaterialTheme.typography.headlineLarge,
        fontWeight = FontWeight.SemiBold,
        color = Color.Blue
        
    )

}

//-----------width and height-----------
//----------alternative methods------------
//1. preferredWidth and preferredHeight
//2. size(width = 80.dp, height = 240.dp)
//3.size(80.dp) --> equal width and height

//4. Modifier.fillMaxSize() ----> Match Parent both
//5. Modifier.fillMaxWidth()---> MatchParent Width

//--------------padding-------------------------
//padding(start = 24.dp, end = 20.dp)
//padding(24.dp) = padding(all=24.dp)

//--------------ordering-----------------
//if clickable is write after padding so padding is
//(cont.) is done first and
//(cont.) and clickable effect will only linited to only inside padding

//----------style--------------
//alternative approach
//style= TextStyle(
//        fontWeight = FontWeight.SemiBold,
//        color = Color.Blue )