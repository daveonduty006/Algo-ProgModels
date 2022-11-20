package troisiemeExercice;

public abstract class VehiculeMaritime implements Vehicule {
	
	abstract int getNbCoques();
	abstract String getSousTypeVehicule();

	@Override
	public String getTypeVehicule() {
		return "vehicule maritime";
	}

	@Override
	public String getCaption() {
		return "Je suis un "+getTypeVehicule()+" donc je me déplace sur l'eau!";
	}

}
