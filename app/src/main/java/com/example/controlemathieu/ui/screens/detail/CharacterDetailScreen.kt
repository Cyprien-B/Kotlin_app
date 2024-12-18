import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.controlemathieu.R
import com.example.controlemathieu.nativemanager.SoundManager
import com.example.controlemathieu.nativemanager.VibrationManager
import com.example.controlemathieu.ui.screens.detail.CharacterDetailViewModel

@Composable
fun CharacterDetailScreen(
    navController: NavController,
    characterId: String,
    viewModel: CharacterDetailViewModel = viewModel()
) {
    val context = LocalContext.current
    val character by viewModel.characterState.collectAsState()

    LaunchedEffect(characterId) {
        viewModel.loadCharacter()
    }

    if (character != null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = stringResource(id = R.string.title_page_detail),
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = character!!.name,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Status: ${character!!.status}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Species: ${character!!.species}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Gender: ${character!!.gender}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Origin: ${character!!.origin.name}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Location: ${character!!.location.name}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = "Appears in episodes:",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            character!!.episode.forEachIndexed { index, episode ->
                Text(
                    text = "Episode ${index + 1}: $episode",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate("characters_list")
                    SoundManager(context).playButtonClickedSound()
                    VibrationManager(context).vibrateOnButtonClicked()
                }
            ) {
                Text(text = stringResource(id = R.string.back_to_list))
            }
        }
    } else {
        CircularProgressIndicator(modifier = Modifier.fillMaxSize())
    }
}
