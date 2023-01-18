package com.doubleclick.androidcompose.Col

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doubleclick.androidcompose.ui.theme.AndroidComposeTheme

/**
 * Created By Eslam Ghazy on 1/18/2023
 */
@Preview
@Composable
fun Col() {
    AndroidComposeTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .weight(1f),
                color = MaterialTheme.colors.primary
            ) {

            }
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .weight(3f),
                color = MaterialTheme.colors.secondary
            ) {

            }
        }
    }
}
