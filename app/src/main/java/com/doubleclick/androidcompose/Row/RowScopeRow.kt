package com.doubleclick.androidcompose.Row

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.doubleclick.androidcompose.ui.theme.AndroidComposeTheme
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created By Eslam Ghazy on 1/18/2023
 */
@Preview
@Composable
fun RowScope.CusRow(weight: Float, color: Color = MaterialTheme.colors.primary) {
    AndroidComposeTheme {
        Surface(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .weight(weight),
            color = color
        ) {

        }
    }
}