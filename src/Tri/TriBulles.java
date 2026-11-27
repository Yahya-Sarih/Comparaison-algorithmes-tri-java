package Tri;
public class TriBulles {
    // Méthode qui trie le tableau à bulles
    public static void triBulles(int[] tab) {

        // Effectuer plusieurs passages sur le tableau
        for (int i = 0; i < tab.length - 1; i++) {

            // Indiquer si un échange a été effectué
            boolean echange = false;

            // Comparer les éléments voisins
            // La partie située à la fin est déjà triée
            for (int j = 0; j < tab.length - 1 - i; j++) {

                // Si les éléments sont dans le mauvais ordre
                if (tab[j] > tab[j + 1]) {

                    // Échanger les deux éléments
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;

                    // Signaler qu'un échange a été effectué
                    echange = true;
                }
            }

            // Si aucun échange n'a été effectué, le tableau est trié
            if (!echange) {
                break;
            }
        }
    }
}