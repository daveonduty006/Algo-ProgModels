package troisiemeExercice;

public class Auto extends VehiculeTerrestre {
	
	private double millage;
	
	Auto(int nbRoues, String couleur, String fabricant, String modele, double millage) {
		super(nbRoues, couleur, fabricant, modele);
		this.millage = millage;
	}

	public double getMillage() {
		return this.millage;
	}
	
	@Override
	public String toString() {
		return "Auto("+super.getNbRoues()+", "+super.getCouleur()+", "+super.getFabricant()+
			   ", "+super.getModele()+", "+millage+")";
	}
	
	

}
