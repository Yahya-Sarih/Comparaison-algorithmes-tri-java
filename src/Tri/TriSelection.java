package Tri;

public class TriSelection {

    // Méthode qui trie le tableau par sélection
    public static void triSelection(int[] tab) {

        // Parcourir le tableau jusqu'à l'avant-dernier élément
        for (int i = 0; i < tab.length - 1; i++) {

            // Considérer l'indice actuel comme celui du minimum
            int min = i;

            // Chercher le plus petit élément dans la partie non triée
            for (int j = i + 1; j < tab.length; j++) {

                // Vérifier si on trouve un élément plus petit
                if (tab[j] < tab[min]) {
                    min = j;
                }
            }

            // Échanger l'élément actuel avec le minimum trouvé
            int temp = tab[i];
            tab[i] = tab[min];
            tab[min] = temp;
        }
    }
}
