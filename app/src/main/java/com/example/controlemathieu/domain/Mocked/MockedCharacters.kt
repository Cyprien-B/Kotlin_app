package com.example.controlemathieu.domain.Mocked

import com.example.controlemathieu.domain.models.Character
import com.example.controlemathieu.domain.models.Location
import com.example.controlemathieu.domain.models.Origin

/**
 * Fonction qui simule l'appel a l'api
 * https://rickandmortyapi.com/api/character
 */
fun getMockedCharacters(): List<Character> {
    return listOf(
        Character(
            id = 6,
            name = "Abadango Cluster Princess",
            status = "Alive",
            species = "Alien",
            type = "",
            gender = "Female",
            origin = Origin(
                name = "Abadango",
                url = "https://rickandmortyapi.com/api/location/2"
            ),
            location = Location(
                name = "Abadango",
                url = "https://rickandmortyapi.com/api/location/2"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/27"),
            url = "https://rickandmortyapi.com/api/character/6",
            created = "2017-11-04T19:50:28.250Z"
        ),
        Character(
            id = 7,
            name = "Abradolf Lincler",
            status = "unknown",
            species = "Human",
            type = "Genetic experiment",
            gender = "Male",
            origin = Origin(
                name = "Earth (Replacement Dimension)",
                url = "https://rickandmortyapi.com/api/location/20"
            ),
            location = Location(
                name = "Testicle Monster Dimension",
                url = "https://rickandmortyapi.com/api/location/21"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/7.jpeg",
            episode = listOf(
                "https://rickandmortyapi.com/api/episode/10",
                "https://rickandmortyapi.com/api/episode/11"
            ),
            url = "https://rickandmortyapi.com/api/character/7",
            created = "2017-11-04T19:59:20.523Z"
        ),
        Character(
            id = 8,
            name = "Adjudicator Rick",
            status = "Dead",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Citadel of Ricks",
                url = "https://rickandmortyapi.com/api/location/3"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/8.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/28"),
            url = "https://rickandmortyapi.com/api/character/8",
            created = "2017-11-04T20:03:34.737Z"
        ),
        Character(
            id = 9,
            name = "Agency Director",
            status = "Dead",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin(
                name = "Earth (Replacement Dimension)",
                url = "https://rickandmortyapi.com/api/location/20"
            ),
            location = Location(
                name = "Earth (Replacement Dimension)",
                url = "https://rickandmortyapi.com/api/location/20"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/9.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/24"),
            url = "https://rickandmortyapi.com/api/character/9",
            created = "2017-11-04T20:06:54.976Z"
        ),
        Character(
            id = 10,
            name = "Alan Rails",
            status = "Dead",
            species = "Human",
            type = "Superhuman (Ghost trains summoner)",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Worldender's lair",
                url = "https://rickandmortyapi.com/api/location/4"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/10.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/25"),
            url = "https://rickandmortyapi.com/api/character/10",
            created = "2017-11-04T20:19:09.017Z"
        ),
        Character(
            id = 11,
            name = "Albert Einstein",
            status = "Dead",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin(
                name = "Earth (C-137)",
                url = "https://rickandmortyapi.com/api/location/1"
            ),
            location = Location(
                name = "Earth (Replacement Dimension)",
                url = "https://rickandmortyapi.com/api/location/20"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/11.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/12"),
            url = "https://rickandmortyapi.com/api/character/11",
            created = "2017-11-04T20:20:20.965Z"
        ),
        Character(
            id = 12,
            name = "Alexander",
            status = "Dead",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin(
                name = "Earth (C-137)",
                url = "https://rickandmortyapi.com/api/location/1"
            ),
            location = Location(
                name = "Anatomy Park",
                url = "https://rickandmortyapi.com/api/location/5"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/12.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/3"),
            url = "https://rickandmortyapi.com/api/character/12",
            created = "2017-11-04T20:32:33.144Z"
        ),
        Character(
            id = 13,
            name = "Alien Googah",
            status = "unknown",
            species = "Alien",
            type = "",
            gender = "unknown",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Earth (Replacement Dimension)",
                url = "https://rickandmortyapi.com/api/location/20"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/13.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/31"),
            url = "https://rickandmortyapi.com/api/character/13",
            created = "2017-11-04T20:33:30.779Z"
        ),
        Character(
            id = 14,
            name = "Alien Morty",
            status = "unknown",
            species = "Alien",
            type = "",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Citadel of Ricks",
                url = "https://rickandmortyapi.com/api/location/3"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/14.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/10"),
            url = "https://rickandmortyapi.com/api/character/14",
            created = "2017-11-04T20:51:31.373Z"
        ),
        Character(
            id = 15,
            name = "Alien Rick",
            status = "unknown",
            species = "Alien",
            type = "",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Citadel of Ricks",
                url = "https://rickandmortyapi.com/api/location/3"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/15.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/10"),
            url = "https://rickandmortyapi.com/api/character/15",
            created = "2017-11-04T20:56:13.215Z"
        ),
        Character(
            id = 16,
            name = "Amish Cyborg",
            status = "Dead",
            species = "Alien",
            type = "Parasite",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Earth (Replacement Dimension)",
                url = "https://rickandmortyapi.com/api/location/20"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/16.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/15"),
            url = "https://rickandmortyapi.com/api/character/16",
            created = "2017-11-04T21:12:45.235Z"
        ),
        Character(
            id = 17,
            name = "Annie",
            status = "Alive",
            species = "Human",
            type = "",
            gender = "Female",
            origin = Origin(
                name = "Earth (C-137)",
                url = "https://rickandmortyapi.com/api/location/1"
            ),
            location = Location(
                name = "Anatomy Park",
                url = "https://rickandmortyapi.com/api/location/5"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/17.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/3"),
            url = "https://rickandmortyapi.com/api/character/17",
            created = "2017-11-04T22:21:24.481Z"
        ),
        Character(
            id = 18,
            name = "Antenna Morty",
            status = "Alive",
            species = "Human",
            type = "Human with antennae",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "Citadel of Ricks",
                url = "https://rickandmortyapi.com/api/location/3"
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/18.jpeg",
            episode = listOf(
                "https://rickandmortyapi.com/api/episode/10",
                "https://rickandmortyapi.com/api/episode/28"
            ),
            url = "https://rickandmortyapi.com/api/character/18",
            created = "2017-11-04T22:25:29.008Z"
        ),
        Character(
            id = 19,
            name = "Antenna Rick",
            status = "unknown",
            species = "Human",
            type = "Human with antennae",
            gender = "Male",
            origin = Origin(
                name = "unknown",
                url = ""
            ),
            location = Location(
                name = "unknown",
                url = ""
            ),
            image = "https://rickandmortyapi.com/api/character/avatar/19.jpeg",
            episode = listOf("https://rickandmortyapi.com/api/episode/10"),
            url = "https://rickandmortyapi.com/api/character/19",
            created = "2017-11-04T22:28:13.756Z"
        )
    )
}