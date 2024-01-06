package com.anonymous.gaia.presentation.chat.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.anonymous.gaia.components.ProgressBar
import com.anonymous.gaia.core.Utils.Companion.print
import com.anonymous.gaia.domain.model.Response.Failure
import com.anonymous.gaia.domain.model.Response.Loading
import com.anonymous.gaia.domain.model.Response.Success
import com.anonymous.gaia.presentation.chat.ChatViewModel

@Composable
fun SendQuestion(
    viewModel: ChatViewModel = hiltViewModel()
) {
    when(val sendQuestionResponse = viewModel.sendQuestionResponse) {
        is Loading -> ProgressBar()
        is Success -> Unit
        is Failure -> print(sendQuestionResponse.e)
    }
}