package troisiemeExercice;

public class FabriqueV_Aerien implements FabriqueAbstraite<VehiculeAerien> {
	
	@Override
	public VehiculeAerien creer(String typeSousVehicule) {
		if("Avion".equalsIgnoreCase(typeSousVehicule)) {
			return (new Avion());
		}else if("Montgolfiere".equalsIgnoreCase(typeSousVehicule)) {
			return (new Montgolfiere());
		}
		return null;
	}

}
