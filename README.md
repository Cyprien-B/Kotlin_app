# Kotlin_app
L'application a pour objectif l'affichage des caractères de l'API Rick and Morty.
L'application utilise les données de l'API Rick and Morty, mais celles-ci sont mockées pour faciliter le projet (voir dossier mock).

## Fonctionnalités
L'utilisateur peut naviguer entre les écrans.
Son joué lorsqu'on clique sur un élément.
Vibration lorsqu'on clique sur un élément.
L'utilisateur peut afficher la liste des personnages.
L'utilisateur peut afficher le détail d'un personnage (mock de l'appel à l'API pour récupérer les détails d'un personnage).
Gestion du dark theme.
Gestion de la langue (en).
```
ControleMathieu/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/controlemathieu/
│   │   │   │   ├── domain/
│   │   │   │   │   ├── Mocked/
│   │   │   │   │   │── api
│   │   │   │   │   ├── models/
│   │   │   │   │   └── repositories/
│   │   │   │   ├── nativeManager/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── component/
│   │   │   │   │   ├── screens/
│   │   │   │   │   │   ├── detail/
│   │   │   │   │   │   └── list/
│   │   │   │   │   └── theme/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
├── build.gradle
└── settings.gradle
```
Pour les choix technique il on été surtout basé sur ce qui marche et sur ce qui respectait le cachier des charges du client
