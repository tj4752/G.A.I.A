package com.anonymous.gaia.presentation.request_name.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.anonymous.gaia.R

@Composable
fun RequestNameTopBar() {
    TopAppBar (
        title = {
            Text(
                text = stringResource(
                    id = R.string.app_name
                )
            )
        }
    )
}