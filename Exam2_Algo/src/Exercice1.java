
public class Exercice1 {
	
	public static void main(String[] args) {
        int[] tableau = {3, -13, 0, -2, 50, 100, 2};
        int taille = tableau.length;
        System.out.println(min(tableau, taille));

	}

	public static int min(int[] tableau, int taille) {
		// Si la taille = 0 alors cela veut dire que
		// le tableau a entièrement été parcouru
		if(taille == 1) {
	        return tableau[0];
		}
	    return Math.min(tableau[taille-1], min(tableau, taille-1));
	}

}
