
public abstract class MonteurMaison {
	
	protected Maison maison;
	
	public Maison getMaison() {
		return this.maison;
	}
	
	public void creerNouvelleMaison() {
		this.maison = new Maison();
	}
	
	public abstract void choisirMateriel();
	public abstract void monterEtage();
	public abstract void monterMurs();
	public abstract void monterToit();

}
