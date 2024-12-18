package com.example.controlemathieu.data.Mocked
import com.example.controlemathieu.domain.models.Character
import com.example.controlemathieu.domain.models.Location
import com.example.controlemathieu.domain.models.Origin

/**
 * Fuction qui retourne tout le temps les information d'un caractére factice
 * Simule un call a l'api https://rickandmortyapi.com/api/character/6
 */
fun getCharacterFromId(): Character? {

    return Character(
            id = 6,
            name = "Abadango Cluster Princess",
            status = "Alive",
            species = "Alien",
            gender = "Female",
            origin = Origin("Abadango", "https://rickandmortyapi.com/api/location/2"),
            location = Location("Abadango", "https://rickandmortyapi.com/api/location/2"),
            image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/27"),
            url = "https://rickandmortyapi.com/api/character/6",
            created = "2017-11-04T19:50:28.250Z",
            type = ""
        )

}