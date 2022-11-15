package troisiemeExercice;

public class FabriqueV_Terrestre implements FabriqueAbstraite<VehiculeTerrestre> {

	@Override
	public VehiculeTerrestre creer(String typeSousVehicule) {
		if("Auto".equalsIgnoreCase(typeSousVehicule)) {
			return (new Auto());
		}else if("Bicyclette".equalsIgnoreCase(typeSousVehicule)) {
			return (new Bicyclette());
		}
		return null;
	}

}
