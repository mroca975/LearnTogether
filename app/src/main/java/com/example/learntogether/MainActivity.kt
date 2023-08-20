package com.example.learntogether

import androidx.compose.foundation.Image
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        stringResource(R.string.title),
                        stringResource(R.string.paragraphOne),
                        stringResource(R.string.paragraphTwo)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
                .align(alignment = Alignment.End)
        )
        Text(
            text = paragraph1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
                .align(alignment = Alignment.End)
        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(title: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column{
        Image(
            painter = image,
            contentDescription = null
        )
        GreetingText(title = title, paragraph1 = paragraph1, paragraph2 = paragraph2)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        GreetingImage(
                stringResource(R.string.title),
                stringResource(R.string.paragraphOne),
                stringResource(R.string.paragraphTwo)
            )
    }
}