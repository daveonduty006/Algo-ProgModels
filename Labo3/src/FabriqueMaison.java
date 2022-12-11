
public class FabriqueMaison {
	
	private MonteurMaison monteur;
	
	public void setMonteurMaison(MonteurMaison unMonteur) {
		this.monteur = unMonteur;
	}
	
	public Maison getMaison() {
		return this.monteur.getMaison();
	}
	
	public void construireMaison() {
		this.monteur.creerNouvelleMaison();
		this.monteur.choisirMateriel();
		this.monteur.monterEtage();
		this.monteur.monterMurs();
		this.monteur.monterToit();
	}

}
