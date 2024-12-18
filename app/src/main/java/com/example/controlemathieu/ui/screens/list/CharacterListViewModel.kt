package com.example.controlemathieu.ui.screens.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.controlemathieu.data.Mocked.getMockedCharacters
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.example.controlemathieu.domain.models.Character
class CharacterListViewModel : ViewModel() {

    private val _characters = MutableStateFlow<List<Character>>(emptyList())
    val characters: StateFlow<List<Character>> get() = _characters

    init {
        loadCharacters()
    }

    private fun loadCharacters() {
        viewModelScope.launch {
            val mockedCharacters = getMockedCharacters()
            _characters.value = mockedCharacters
        }
    }
}
