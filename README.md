# Kotlin_app
L'application a pour objectif l'affichage des caractères de l'API Rick and Morty.
L'application utilise les données de l'API Rick and Morty, mais celles-ci sont mockées pour faciliter le projet (voir dossier mock).

## Fonctionnalités
- L'utilisateur peut naviguer entre les écrans.
- Son joué lorsqu'on clique sur un élément.
- Vibration lorsqu'on clique sur un élément.
- L'utilisateur peut afficher la liste des personnages.
- L'utilisateur peut afficher le détail d'un personnage (mock de l'appel à l'API pour récupérer les détails d'un personnage).
- Gestion du dark theme.
- Gestion de la langue (en).

## Architecture du projet 
Au niveau de l'architecture, j'ai separer les donnée dans data, la manipulation de celle ci dans domain, les vue dans ui et la logique des vues dans le viewmodel
```
ControleMathieu/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/controlemathieu/
│   │   │   │   ├── data/
│   │   │   │   │   ├── Mocked/
│   │   │   │   │   │── api
│   │   │   │   ├── domain/
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


Pour les choix techniques, je suis parti sur Kotlin car c'est le langage pour applications mobiles que je maîtrise.
