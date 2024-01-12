package com.anonymous.gaia.domain.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class Question(
    var prompt: String? = null,
    @ServerTimestamp
    var creationTime: Date? = null,
    var createdBy: String? = null,
    var response: String? = null,
)