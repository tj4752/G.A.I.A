package com.anonymous.gaia.presentation.chat.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.anonymous.gaia.components.ProgressBar
import com.anonymous.gaia.core.Utils.Companion.print
import com.anonymous.gaia.domain.model.Response.Failure
import com.anonymous.gaia.domain.model.Response.Loading
import com.anonymous.gaia.domain.model.Response.Success
import com.anonymous.gaia.domain.repository.Questions
import com.anonymous.gaia.presentation.chat.ChatViewModel

@Composable
fun Questions(
    viewModel: ChatViewModel = hiltViewModel(),
    chatContent: @Composable (questions: Questions) -> Unit
) {
    when(val questionsResponse = viewModel.questionsResponse) {
        is Loading -> ProgressBar()
        is Success -> chatContent(questionsResponse.data)
        is Failure -> print(questionsResponse.e)
    }
}