package troisiemeExercice;

public abstract class VehiculeTerrestre implements Vehicule {
	
	abstract int getNbRoues();
	abstract String getSousTypeVehicule();

	@Override
	public String getTypeVehicule() {
		return "vehicule terrestre";
	}

	@Override
	public String getCaption() {
		return "Je suis un "+getTypeVehicule()+" donc je me déplace sur la terre!";
	}
	
}
