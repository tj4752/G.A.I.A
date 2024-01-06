package com.anonymous.gaia.domain.repository

import kotlinx.coroutines.flow.Flow
import com.anonymous.gaia.domain.model.Question
import com.anonymous.gaia.domain.model.Response

typealias Questions = List<Question>
typealias QuestionsResponse = Response<Questions>
typealias SendQuestionResponse = Response<Boolean>

interface ChatRepository {
    fun getQuestionsFromFirestore(): Flow<QuestionsResponse>

    suspend fun sendQuestionToFirestore(name: String, question: String): SendQuestionResponse
}