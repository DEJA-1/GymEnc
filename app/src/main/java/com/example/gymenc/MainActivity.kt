package com.example.gymenc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gymenc.navigation.Navigation
import com.example.gymenc.ui.theme.GymEncTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Navigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    GymEncTheme {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   MyApp {
       Navigation()
   }
}