package Tri;

public class TriInsertion {

    // Méthode qui trie le tableau par insertion
    public static void triInsertion(int[] tab) {

        // Commencer à partir du deuxième élément
        for (int i = 1; i < tab.length; i++) {

            // Récupérer l'élément à insérer
            int key = tab[i];

            // Commencer la comparaison avec l'élément précédent
            int j = i - 1;

            // Décaler vers la droite les éléments supérieurs à key
            while (j >= 0 && tab[j] > key) {

                tab[j + 1] = tab[j];

                // Passer à l'élément précédent
                j--;
            }

            // Insérer key à sa position correcte
            tab[j + 1] = key;
        }
    }
}