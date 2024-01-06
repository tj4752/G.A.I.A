package com.anonymous.gaia.di

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import com.anonymous.gaia.core.QUESTIONS
import com.anonymous.gaia.data.repository.ChatRepositoryImpl
import com.anonymous.gaia.domain.repository.ChatRepository

@Module
@InstallIn(ViewModelComponent::class)
class AppModule {
    @Provides
    fun provideQuestionsRef(): ChatRepository = ChatRepositoryImpl(
        questionsRef = Firebase.firestore.collection(QUESTIONS)
    )
}