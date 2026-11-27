package Tri;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Définir les différentes tailles des tableaux à tester
        int[] tailles = {1000, 5000, 10000, 50000};
        // Créer un générateur de nombres aléatoires
        Random rand = new Random();
        // Tester chaque taille de tableau
        for (int taille : tailles) {
            // Créer le tableau initial
            int[] tab = new int[taille];
            // Remplir le tableau avec des valeurs aléatoires
            for (int i = 0; i < taille; i++) {
                tab[i] = rand.nextInt(100000);
            }
            // Créer trois copies identiques du tableau initial
            int[] tab1 = tab.clone();
            int[] tab2 = tab.clone();
            int[] tab3 = tab.clone();
            // --------------------------------
            // Mesurer le temps du tri sélection
            // --------------------------------
            long debut1 = System.nanoTime();
            // Appeler la méthode du tri par sélection
            TriSelection.triSelection(tab1);
            long fin1 = System.nanoTime();
            // Convertir le temps en millisecondes
            double temps1 = (fin1 - debut1) / 1_000_000.0;
            
            // --------------------------------
            // Mesurer le temps du tri à bulles
            // --------------------------------
            long debut2 = System.nanoTime();
            // Appeler la méthode du tri à bulles
            TriBulles.triBulles(tab2);
            long fin2 = System.nanoTime();
            // Convertir le temps en millisecondes
            double temps2 = (fin2 - debut2) / 1_000_000.0;

            // --------------------------------
            // Mesurer le temps du tri insertion
            // --------------------------------
            long debut3 = System.nanoTime();

            // Appeler la méthode du tri par insertion
            TriInsertion.triInsertion(tab3);
            long fin3 = System.nanoTime();
            // Convertir le temps en millisecondes
            double temps3 = (fin3 - debut3) / 1_000_000.0;   
            // --------------------------------
            // Afficher les résultats
            // -------------------------------- 
            System.out.println("Taille du tableau : " + taille);
            System.out.println("Tri par sélection : "+ temps1 + " ms");
            System.out.println("Tri à bulles : "+ temps2 + " ms");
            System.out.println("Tri par insertion : "+ temps3 + " ms");
            System.out.println("----------------------------------");
        }
    }
}