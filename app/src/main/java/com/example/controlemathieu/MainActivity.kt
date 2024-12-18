package com.example.controlemathieu

import CharacterDetailScreen
import CharacterListScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.controlemathieu.ui.theme.ControleMathieuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            ControleMathieuTheme {
                NavHost(
                    navController = navController,
                    startDestination = "characters_list"
                ) {
                    composable(
                        route = "characters_list"
                    ) {
                        CharacterListScreen(
                            navController = navController
                        )
                    }
                    composable(
                        route = "characters_detail/{characterId}"
                    ) { backStackEntry ->
                        val characterId = backStackEntry.arguments?.getString("characterId") ?: ""
                        CharacterDetailScreen(navController = navController, characterId = characterId)
                    }
                }
            }
        }
    }
}
