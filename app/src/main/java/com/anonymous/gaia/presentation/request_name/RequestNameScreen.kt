package com.anonymous.gaia.presentation.request_name

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import com.anonymous.gaia.presentation.request_name.components.RequestNameContent
import com.anonymous.gaia.presentation.request_name.components.RequestNameTopBar

@Composable
@ExperimentalComposeUiApi
fun RequestNameScreen(
    navigateToChatScreen: (name: String) -> Unit
) {
    Scaffold(
        topBar = {
            RequestNameTopBar()
        },
        content = { padding ->
            RequestNameContent(
                padding = padding,
                navigateToChatScreen = navigateToChatScreen
            )
        }
    )
}