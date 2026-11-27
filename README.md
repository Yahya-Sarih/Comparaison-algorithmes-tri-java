# Étude comparative des algorithmes de tri en Java

## Présentation du projet

Ce mini-projet consiste à étudier et à comparer trois algorithmes classiques de tri implémentés en langage Java :

- **Tri par sélection (Selection Sort)**
- **Tri à bulles (Bubble Sort)**
- **Tri par insertion (Insertion Sort)**

L'objectif est de comprendre le fonctionnement de chaque algorithme, d'étudier sa complexité théorique et de comparer ses performances à travers des tests expérimentaux.

## Structure du projet

```text
ProjetTri/
│
├── src/
│   └── Tri/
│       ├── TriSelection.java
│       ├── TriBulles.java
│       ├── TriInsertion.java
│       └── Main.java
│
├── README.md
└── .gitignore
```

## Technologies utilisées

- Java
- Eclipse IDE
- Git
- GitHub

## Fonctionnement

Le programme utilise une classe principale `Main` pour exécuter les trois algorithmes et mesurer leurs temps d'exécution.

Pour chaque taille de tableau, des valeurs aléatoires sont générées. Trois copies identiques du tableau initial sont ensuite créées afin que chaque algorithme travaille sur les mêmes données.

La mesure du temps est effectuée avec la méthode `System.nanoTime()`.

## Tailles des tableaux testés

Les expérimentations sont réalisées avec les tailles suivantes :

- 1 000 éléments
- 5 000 éléments
- 10 000 éléments
- 50 000 éléments

## Complexité algorithmique

| Algorithme | Meilleur cas | Cas moyen | Pire cas |
|---|---|---|---|
| Tri par sélection | O(n²) | O(n²) | O(n²) |
| Tri à bulles optimisé | O(n) | O(n²) | O(n²) |
| Tri par insertion | O(n) | O(n²) | O(n²) |

## Résultats expérimentaux

Les temps d'exécution des trois algorithmes sont mesurés et comparés pour les différentes tailles de tableaux.

Le tri à bulles présente les temps d'exécution les plus élevés dans nos tests. Le tri par insertion obtient le meilleur temps pour les tableaux de 50 000 éléments.


