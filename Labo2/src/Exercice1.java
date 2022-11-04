
public class Exercice1 {
		
	  /*
	  Algorithme récursif résoudant le problème des Tours d'Hanoï
	  	  
	     |          |          |
	     |          |          |
	     |          |          |
	  -------    -------    -------
	     A          B          C
	    
	  */
	
    public static void main(String[] args) {
        // Nombre de disques
    	int N = 3;
    	// A, B et C sont le nom des tours
    	// Premier tour: disque sur A vers C 
        toursDeHanoi(N, 'A', 'C', 'B');
    }
    
	public static void toursDeHanoi(int n, 
			                        char tourEmplacementInitial, 
			                        char tourNouvelEmplacement, 
			                        char tourNonUtilisee) {
		// Condition d'arrêt de la récursion
		if(n == 0) {
			return;
		}		
		// disque avec lequel on effectue le déplacement ---> paramètre 1
		// emplacement présent du disque -------------------> paramètre 2
		// destination du disque ---------------------------> paramètre 3
		// tour non-utilisée pour le déplacement -----------> paramètre 4
		toursDeHanoi(n-1, tourEmplacementInitial, tourNonUtilisee, tourNouvelEmplacement);
		System.out.println(" Disque #"+n+" déplacé de la tour "+tourEmplacementInitial+
				           " vers la tour "+tourNouvelEmplacement);
		toursDeHanoi(n-1, tourNonUtilisee, tourNouvelEmplacement, tourEmplacementInitial);
	}
	
}
