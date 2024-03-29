package com.anonymous.gaia.presentation

import android.os.Bundle
import android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.rememberNavController
import com.anonymous.gaia.navigation.NavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSoftInputMode()
        setContent {
            NavGraph(
                navController = rememberNavController()
            )
        }
    }

    @Suppress("DEPRECATION")
    private fun setSoftInputMode() = window.setSoftInputMode(SOFT_INPUT_ADJUST_RESIZE)
}