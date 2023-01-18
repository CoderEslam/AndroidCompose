package com.doubleclick.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.androidcompose.Col.Col
import com.doubleclick.androidcompose.Row.CusRow
import com.doubleclick.androidcompose.Text.AnnotatText
import com.doubleclick.androidcompose.Text.CustomText
import com.doubleclick.androidcompose.Text.CustomTextRepeat
import com.doubleclick.androidcompose.ui.theme.AndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Column {
                        AnnotatText()
                        CustomTextRepeat()
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting() {

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeTheme {
    }
}




