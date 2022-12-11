
public class MonteurMaisonBeton extends MonteurMaison {

	@Override
	public void monterEtage() {
		maison.setEtage("étage en béton");
	}

	@Override
	public void monterMurs() {
		maison.setMurs("murs en béton");
	}

	@Override
	public void monterToit() {
		maison.setToit("toit en béton");	
	}

	@Override
	public void choisirMateriel() {
		maison.setMateriel("béton");
	}

}
