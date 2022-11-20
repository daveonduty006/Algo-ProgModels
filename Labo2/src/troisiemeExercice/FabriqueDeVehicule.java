package troisiemeExercice;

public class FabriqueDeVehicule {
	
	public static FabriqueAbstraite<?> getFabrique(char typeVehicule) {
		switch(typeVehicule) {
			case 'T':
				return (new FabriqueV_Terrestre());
			case 'M':
				return (new FabriqueV_Maritime());
			case 'A':
				return (new FabriqueV_Aerien());
			default:
				return null;
		}
	}
    
}
