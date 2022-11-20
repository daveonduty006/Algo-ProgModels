package troisiemeExercice;

public abstract class VehiculeAerien implements Vehicule {
	
	abstract String getMoyenSustentation();
	abstract String getSousTypeVehicule();

	@Override
	public String getTypeVehicule() {
		return "vehicule aerien";
	}

	@Override
	public String getCaption() {
		return "Je suis un "+getTypeVehicule()+" donc je me déplace dans l'atmosphère!";
	}

}
