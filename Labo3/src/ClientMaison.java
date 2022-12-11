
public class ClientMaison {
	
	public FabriqueMaison uneFabrique = new FabriqueMaison();
	
	public MonteurMaisonBois unMonteurMaisonEnBois = new MonteurMaisonBois();
	public MonteurMaisonBeton unMonteurMaisonEnBeton = new MonteurMaisonBeton();
	
	public Maison uneMaison;
	
	ClientMaison(){
		uneFabrique.setMonteurMaison(unMonteurMaisonEnBois); // La 'fabrique' (en réalité le directeur) reçoit le plan (un monteur concret) pour 
		                                                     // construire le produit, soit une maison en bois.
		
		uneFabrique.construireMaison();                      // La fabrique ordonne la construction d'une maison en bois (le processus s'enclenche).
		
		uneMaison = uneFabrique.getMaison();                 // On récupère l'objet complété
		
		System.out.println(uneMaison.getMaisonRepresentation()); // Affichage à la console du getRepresentation de la Maison (lui-même composé 
		                                                         // des getRepresentations de ses composants (etage,murs,toit).
		
		System.out.println();
		
		uneFabrique.setMonteurMaison(unMonteurMaisonEnBeton); // Construction d'une maison en béton cette fois-cî.
		uneFabrique.construireMaison();
		uneMaison = uneFabrique.getMaison();
		System.out.println(uneMaison.getMaisonRepresentation());
	}

}
