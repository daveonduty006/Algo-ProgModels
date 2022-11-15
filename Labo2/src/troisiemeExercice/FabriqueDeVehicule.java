package troisiemeExercice;

public class FabriqueDeVehicule {
	
	public static FabriqueAbstraite getFabrique(char typeVehicule) {
		switch(typeVehicule) {
			case 'T':
				return (new FabriqueV_Terrestre());
		}
		return null;
	}
    
}
