package troisiemeExercice;

public class FabriqueV_Maritime implements FabriqueAbstraite<VehiculeMaritime>{

	@Override
	public VehiculeMaritime creer(String typeSousVehicule) {
		if("Paquebot".equalsIgnoreCase(typeSousVehicule)) {
			return (new Paquebot());
		}else if("Catamaran".equalsIgnoreCase(typeSousVehicule)) {
			return (new Catamaran());
		}
		return null;
	}

}
