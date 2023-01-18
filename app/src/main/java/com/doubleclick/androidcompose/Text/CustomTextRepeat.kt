package com.doubleclick.androidcompose.Text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created By Eslam Ghazy on 1/18/2023
 */

@Preview
@Composable
fun CustomTextRepeat() {
    Text(text = "Eslam".repeat(50), maxLines = 2, overflow = TextOverflow.Ellipsis)
}