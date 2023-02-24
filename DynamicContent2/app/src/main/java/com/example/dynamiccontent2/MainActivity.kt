package com.example.dynamiccontent2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dynamiccontent2.ui.theme.DynamicContent2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DynamicContent2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}
@Composable
fun MainScreen()
{
    val namesStateList = remember{mutableStateListOf<String>("Jai Shree Ram")}
    Column(
        modifier  = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        GreetingList(namesStateList
        ) {
            namesStateList.add("Jai SHree Ram")
        }
    }
}

@Composable
fun GreetingList(namesList: List<String>, buttonClick: ()->Unit)
{

    for(name in namesList)
        Greeting(name = name)
    Button(onClick =buttonClick) {
        Greeting(name = "Hail")

    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DynamicContent2Theme {
        MainScreen()
    }
}