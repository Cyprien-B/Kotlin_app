package com.example.controlemathieu.nativemanager

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioFocusRequest
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.annotation.RawRes
import com.example.controlemathieu.R

/**
 * Extension de la classe Context pour jouer un son de manière simple et réutilisable.
 */

/**
 * Fonction d'extension pour jouer un son spécifique.
 * @param resId Ressource du son à jouer (exemple : R.raw.ding).
 */
fun Context.playSound(@RawRes resId: Int) {
    val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

    // Configure les attributs audio pour le type de sonification.
    val audioAttributes = AudioAttributes.Builder()
        .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
        .build()

    // Demande d'accès audio avec les règles définies.
    val focusRequest = AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)
        .setAudioAttributes(audioAttributes)
        .setAcceptsDelayedFocusGain(false)
        .setWillPauseWhenDucked(false)
        .build()

    // Prépare le MediaPlayer.
    val mediaPlayer = MediaPlayer.create(this, resId).apply {
        setOnCompletionListener {
            audioManager.abandonAudioFocusRequest(focusRequest)
            release() // Libération des ressources après lecture.
        }
    }

    // Demande le focus audio et joue le son si accordé.
    val result = audioManager.requestAudioFocus(focusRequest)
    if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
        mediaPlayer.start()
    }
}

/**
 * Fonction d'extension dédiée pour jouer un son de clic de bouton.
 */
fun Context.playButtonClickedSound() {
    playSound(R.raw.ding)
}