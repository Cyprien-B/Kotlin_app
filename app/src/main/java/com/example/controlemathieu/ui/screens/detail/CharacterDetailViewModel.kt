package com.example.controlemathieu.ui.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.controlemathieu.data.Mocked.getCharacterFromId
import com.example.controlemathieu.domain.models.Character
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class CharacterDetailViewModel : ViewModel() {

    private val _characterState = MutableStateFlow<Character?>(null)
    val characterState: StateFlow<Character?> get() = _characterState

    fun loadCharacter() {
        viewModelScope.launch {
            val character = getCharacterFromId()
            _characterState.value = character
        }
    }
}

