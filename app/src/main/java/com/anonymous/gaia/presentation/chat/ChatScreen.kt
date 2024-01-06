package com.anonymous.gaia.presentation.chat

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.anonymous.gaia.presentation.chat.components.ChatContent
import com.anonymous.gaia.presentation.chat.components.ChatTopBar
import com.anonymous.gaia.presentation.chat.components.Questions
import com.anonymous.gaia.presentation.chat.components.SendQuestion

@Composable
fun ChatScreen(
    viewModel: ChatViewModel = hiltViewModel(),
    name: String,
    navigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            ChatTopBar(
                navigateBack = navigateBack
            )
        },
        content = { padding ->
            Questions(
                chatContent = { questions ->
                    ChatContent(
                        padding = padding,
                        questions = questions,
                        sendQuestion = { question ->
                            viewModel.sendQuestion(name, question)
                        }
                    )
                }
            )
        }
    )
    SendQuestion()
}