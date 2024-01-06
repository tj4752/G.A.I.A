package com.anonymous.gaia.navigation

import com.anonymous.gaia.core.CHAT_SCREEN_ROUTE
import com.anonymous.gaia.core.REQUEST_NAME_SCREEN_ROUTE

sealed class Screen(val route: String) {
    object RequestNameScreen: Screen(REQUEST_NAME_SCREEN_ROUTE)
    object ChatScreen: Screen(CHAT_SCREEN_ROUTE)
}