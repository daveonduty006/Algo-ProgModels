package troisiemeExercice;

public abstract class VehiculeTerrestre extends Vehicule {
	
	private int nbRoues;
	private String couleur, modele, fabricant;
	
	VehiculeTerrestre(int nbRoues, String couleur, String fabricant, String modele) {
		this.nbRoues = nbRoues;
		this.couleur = couleur;
		this.fabricant = fabricant;
		this.modele = modele;
	}
	
	public int getNbRoues() {
		return this.nbRoues;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public String getFabricant() {
		return this.fabricant;
	}
	
	public String getModele() {
		return this.modele;
	}
		
	public String toString() {
		return "Je suis un Véhicule Terrestre donc je roule!";
	}
	
}
