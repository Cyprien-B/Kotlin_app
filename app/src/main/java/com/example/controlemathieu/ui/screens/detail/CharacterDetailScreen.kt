package com.example.controlemathieu.ui.screens.detail

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.controlemathieu.domain.Mocked.getCharacterFromId
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.controlemathieu.R
import com.example.controlemathieu.nativemanager.SoundManager
import com.example.controlemathieu.nativemanager.VibrationManager


@Composable
fun CharacterDetailScreen(navController: NavController)
{
    val context = LocalContext.current
    val character = getCharacterFromId()

    if (character != null) {

        if (character != null) {
        Text(
            text = stringResource(id = R.string.title_page_detail)
        )}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
                .clickable {
                    // Naviguer vers CharacterDetailScreen en passant l'ID du personnage
                    navController.navigate("characters_list")
                    SoundManager(context).playButtonClickedSound()
                    VibrationManager(context).vibrateOnButtonClicked()
                }
        ) {

            // Affichage des informations du personnage
            Text(
                text = character.name,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Status: ${character.status}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Species: ${character.species}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Gender: ${character.gender}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Origin: ${character.origin.name}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Location: ${character.location.name}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )

            // Affichage des épisodes
            Text(
                text = "Appears in episodes:",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            character.episode.forEachIndexed { index, episode ->
                Text(
                    text = "Episode ${index + 1}: $episode",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    } else {
        // Si les données du personnage ne sont pas disponibles
        Text(text = "Character not found", style = MaterialTheme.typography.headlineSmall)
    }
}
