package com.doubleclick.androidcompose.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.androidcompose.R

/**
 * Created By Eslam Ghazy on 1/18/2023
 */

@Preview
@Composable
fun CustomText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .background(MaterialTheme.colors.onError)
        ) {
            Text(
                text = stringResource(id = R.string.app_name) + "Hello",
                modifier = Modifier
                    .background(MaterialTheme.colors.secondary)
                    .width(300.dp)
                    .padding(16.dp),
                color = Color.White,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End
            )

        }
    }
}



