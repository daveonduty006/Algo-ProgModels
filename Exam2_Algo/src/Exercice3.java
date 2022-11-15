
public class Exercice3 {
	
	public static void main(String[] args) {
        int[] tableau = {2, 3, 4, 10, 40};
        int n = tableau.length;
        int x = 10;
        int resultat = rechercheBinaire(tableau, 0, n - 1, x);
        if(resultat == -1) {
            System.out.println("L'�l�ment recherch� n'est pas pr�sent");
        }else {
            System.out.println("�lement trouv� � l'index "+resultat);
        }
	}

    public static int rechercheBinaire(int[] tableau, int l, int r, int x) {
        if(r >= l) {
            int mid = l + (r - l) / 2;
            // Si l'�l�ment est pr�sent en plein milieu du tableau 
            if(tableau[mid] == x) {
                return mid;
            }
            // Si l'�l�ment est plus petit que l'�l�ment au milieu,
            // alors sa pr�sence potentielle ne peut qu'�tre dans le 
            // sous-tableau � gauche
            if(tableau[mid] > x) {
                return rechercheBinaire(tableau, l, mid - 1, x);
            }
            // Sinon l'�l�ment peut seulement �tre potentiellement 
            // pr�sent dans le sous-tableau � droite
            return rechercheBinaire(tableau, mid + 1, r, x);
        }
        // Si on arrive ici alors l'�l�ment n'est pas pr�sent dans 
        // le tableau
        return -1;
    }

}
