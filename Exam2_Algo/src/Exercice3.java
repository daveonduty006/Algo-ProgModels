
public class Exercice3 {
	
	public static void main(String[] args) {
        int[] tableau = {2, 3, 4, 10, 40};
        int n = tableau.length;
        int x = 10;
        int resultat = rechercheBinaire(tableau, 0, n - 1, x);
        if(resultat == -1) {
            System.out.println("L'élément recherché n'est pas présent");
        }else {
            System.out.println("Élement trouvé à l'index "+resultat);
        }
	}

    public static int rechercheBinaire(int[] tableau, int l, int r, int x) {
        if(r >= l) {
            int mid = l + (r - l) / 2;
            // Si l'élément est présent en plein milieu du tableau 
            if(tableau[mid] == x) {
                return mid;
            }
            // Si l'élément est plus petit que l'élément au milieu,
            // alors sa présence potentielle ne peut qu'être dans le 
            // sous-tableau à gauche
            if(tableau[mid] > x) {
                return rechercheBinaire(tableau, l, mid - 1, x);
            }
            // Sinon l'élément peut seulement être potentiellement 
            // présent dans le sous-tableau à droite
            return rechercheBinaire(tableau, mid + 1, r, x);
        }
        // Si on arrive ici alors l'élément n'est pas présent dans 
        // le tableau
        return -1;
    }

}
