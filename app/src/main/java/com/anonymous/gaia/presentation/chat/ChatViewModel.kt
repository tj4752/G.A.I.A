package com.anonymous.gaia.presentation.chat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import com.anonymous.gaia.domain.model.Response.Loading
import com.anonymous.gaia.domain.model.Response.Success
import com.anonymous.gaia.domain.repository.ChatRepository
import com.anonymous.gaia.domain.repository.QuestionsResponse
import com.anonymous.gaia.domain.repository.SendQuestionResponse
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(
    private val repo: ChatRepository
): ViewModel() {
    var questionsResponse by mutableStateOf<QuestionsResponse>(Loading)
        private set
    var sendQuestionResponse by mutableStateOf<SendQuestionResponse>(Success(false))
        private set

    init {
        getQuestions()
    }

    private fun getQuestions() = viewModelScope.launch {
        repo.getQuestionsFromFirestore().collect { response ->
            questionsResponse = response
        }
    }

    fun sendQuestion(name: String, question: String) = viewModelScope.launch {
        sendQuestionResponse = Loading
        sendQuestionResponse = repo.sendQuestionToFirestore(name, question)
    }
}