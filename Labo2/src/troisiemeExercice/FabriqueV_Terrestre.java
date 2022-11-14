package troisiemeExercice;

public class FabriqueV_Terrestre extends FabriqueDeVehicules {

	@Override
	public Vehicule creerVehicule() {
		return (new VehiculeTerrestre());
	}

}
