
public class MonteurMaisonBois extends MonteurMaison {
	
	@Override
	public void monterEtage() {
		maison.setEtage("étage en bois");
	}

	@Override
	public void monterMurs() {
		maison.setMurs("murs en bois");
	}

	@Override
	public void monterToit() {
		maison.setToit("toit en bois");	
	}

	@Override
	public void choisirMateriel() {
		maison.setMateriel("bois");
	}

}
