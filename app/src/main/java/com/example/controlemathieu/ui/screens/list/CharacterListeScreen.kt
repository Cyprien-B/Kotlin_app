import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.controlemathieu.domain.Mocked.getMockedCharacters
import com.example.controlemathieu.nativemanager.SoundManager
import com.example.controlemathieu.nativemanager.VibrationManager
import com.example.controlemathieu.R

@Composable
fun CharacterListScreen(navController: NavController) {
    val context = LocalContext.current
    val characters = getMockedCharacters()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Titre centré en haut de l'écran
        Text(
            text = stringResource(id = R.string.title_page_acceuil),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            textAlign = TextAlign.Center
        )

        // Liste des personnages
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(characters) { character ->
                // Cadre pour chaque personnage
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(colorResource(id = R.color.purple_500)) // ici j'utilise la couleur pour le theme
                        .padding(8.dp)
                        .clickable {
                            // Naviguer vers CharacterDetailScreen en passant l'ID du personnage
                            navController.navigate("characters_detail/${character.id}")
                            SoundManager(context).playButtonClickedSound()
                            VibrationManager(context).vibrateOnButtonClicked()
                        }

                ) {
                    Column {
                        Text(text = "Name: ${character.name}", style = MaterialTheme.typography.bodyLarge)
                        Text(text = "Status: ${character.status}", style = MaterialTheme.typography.bodySmall)
                        Text(text = "Species: ${character.species}", style = MaterialTheme.typography.bodySmall)
                        Text(text = "Gender: ${character.gender}", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}


