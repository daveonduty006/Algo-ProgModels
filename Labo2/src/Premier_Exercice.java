
public class Premier_Exercice {
		
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
    	// A, B et C sont les noms des tours
    	
    	// Nous voulons d'abord résoudre le puzzle avant de le coder.
    	// Solution Tours d'Hanoï avec 3 Disques:
    	// 1. D1 de A vers C 
    	// 2. D2 de A vers B
    	// 3. D1 de C vers B
    	// 4. D3 de A vers C
    	// 5. D1 de B vers A
    	// 6. D2 de B vers C
    	// 7. D1 de A vers C
    	// Il y aura donc 7 print.
    	
    	// Pour commencer à coder notre solution, via un algorithme récursif,
    	// nous allons évidemment structurer notre code selon le principe 
    	// fondamental de la récursion: la diminution de notre input (ici 'N').
    	// Notre plus gros input ici est 3 (le disque 3), nous allons donc 
    	// écrire notre code pour que nous implémentions le prochain mouvement (au départ 
    	// le premier mouvement) du disque 3 en premier récursivement. Il sera la base de 
    	// notre pile grandissante, laquelle comportera également le prochain 
    	// (donc même chose au départ le premier) mouvement du disque 2 au milieu de la pile et 
    	// finalement le prochain mouvement du disque 1, ce dernier étant au sommet de la pile 
    	// et sera donc notre premier print de la partie.
    	
    	// Notre premier appel à toursDeHanoi sera donc:
        toursDeHanoi(N, 'A', 'C', 'B');
        // car le premier mouvement (et le seul avec un jeu de 3 disque) du plus gros disque 
        // N (3) doit former le premier appel à toursDeHanoi. 
    }
    
	public static void toursDeHanoi(int n, 
			                        char tourEmplacementInitial, 
			                        char tourNouvelEmplacement, 
			                        char tourAuxiliaire) {
		// Condition d'arrêt de la récursion (il n'y a pas de disque 0)
		if(n == 0) {
			return;
		}		
		// disque avec lequel on effectue le déplacement ---> paramètre 1
		// emplacement présent du disque -------------------> paramètre 2
		// destination du disque ---------------------------> paramètre 3
		// tour non-utilisée pour le déplacement -----------> paramètre 4
		
		// On empile dans le call stack jusqu'à ce que nous soyons à notre condition
		// d'arrêt.
		toursDeHanoi(n-1, tourEmplacementInitial, tourAuxiliaire, tourNouvelEmplacement);
		// Exemple: État du premier call stack (avant les déplacements simulés par le print):
		// 			Pile_Base = (3, A, C, B)
		// 			Pile 2 =    (2, A, B, C)
		// 			Pile_Top =  (1, A, C, B)
		System.out.println(" Disque #"+n+" déplacé de la tour "+tourEmplacementInitial+
				           " vers la tour "+tourNouvelEmplacement);
		// On rappelle toursDeHanoi pour préparer le prochain mouvement du disque N-1 
		// (où N représente le disque qui vient d'être déplacé) 
		// OU
		// pour dynamiquement ajuster le call stack si N était le disque 1
		toursDeHanoi(n-1, tourAuxiliaire, tourNouvelEmplacement, tourEmplacementInitial);
	}
	
	// Analyse du BigO = À chaque appel récursif s'empilant dans le call stack, 
	//                   nous avons 2 possibilités: L'algorithme se rappelle et
    //                   grossi la pile s'il passe le test de la condition d'arrêt
	//                   ou le thread se termine via la condition d'arrêt.
	//                   donc: (2 x 2 x 2 x ... x 2) x N = 2^N
	
}
