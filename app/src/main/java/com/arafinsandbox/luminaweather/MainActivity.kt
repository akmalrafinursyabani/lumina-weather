package com.arafinsandbox.luminaweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arafinsandbox.luminaweather.ui.theme.LuminaWeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LuminaWeatherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sed iaculis elit, vitae commodo velit. Vivamus vulputate mauris tortor, sed dapibus libero posuere ac. Nulla non laoreet quam, et viverra dui. Phasellus et dolor nunc. Praesent dignissim eleifend enim porta aliquam. Suspendisse eget augue vel purus euismod tincidunt sed non dui. Maecenas non lacus sapien. In ultrices tellus aliquam nibh pellentesque, at imperdiet ipsum laoreet. ",
        style = MaterialTheme.typography.bodyMedium,
        modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LuminaWeatherTheme {
        Greeting("Android")
    }
}