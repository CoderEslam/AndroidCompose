package com.doubleclick.androidcompose.Text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.doubleclick.androidcompose.ui.theme.Typography

/**
 * Created By Eslam Ghazy on 1/18/2023
 */
@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        style = Typography.h5
    )
}
