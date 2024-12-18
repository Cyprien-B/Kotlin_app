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

Les critères de notation que mon projet respecte :
- Le projet de l'application est séparé dans des couches distinctes.
- Tout ce qui concerne l'UI (Presenter) est rassemblé et rien de ce qui concerne cette couche n'en sort. 
- Tout ce qui concerne l'accès aux données (Data) est contenu dans une couche qui lui est propre. 
- Une seule Activity contient le projet.
- La navigation est gérée par le biais d'un Manager (NavigationManager).
- Le design system(Boutons, Champs textes, Composants brandés...) a été intégré et sa localisation est reconnaissable au sein de la couche UI (Presenter). 
- L'apprenant a réussi à s'approprier l'architecture des écrans (Screen.kt - ViewModel.kt + utilisation de programmation réactive via les StateFlow). 
- Chaque composant d'un écran a un rôle spécifique et est exempt de toute logique ne lui appartenant pas. 
- Utilisation d'au moins 2 capacités natives du device . Ok Son et vibration au click
- L'accès aux capacités natives du device est géré de manière centralisé et est détaché du reste de la couche UI (Presenter)
- A su mettre en place au moins une fonction d'extension dans laquelle intervient le Context comme classe à étendre. OK pour SoundManagment
