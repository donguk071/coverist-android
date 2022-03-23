package dev.yjyoon.coverist.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.yjyoon.coverist.ui.theme.CoveristTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoveristTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}

