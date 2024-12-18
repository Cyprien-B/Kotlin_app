package com.example.controlemathieu.ui.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.platform.LocalContext
import com.example.controlemathieu.R
import com.example.controlemathieu.nativemanager.VibrationManager
import com.example.controlemathieu.nativemanager.playButtonClickedSound

@Composable
fun CustomBackButton(onClick: () -> Unit) {
    val context = LocalContext.current

    Button(
        onClick = {
            onClick()
            context.playButtonClickedSound()
            VibrationManager(context).vibrateOnButtonClicked()
        }
    ) {
        Text(text = stringResource(id = R.string.back_to_list))
    }
}

