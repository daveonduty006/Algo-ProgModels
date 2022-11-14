package troisiemeExercice;

public abstract class FabriqueDeVehicules {
	
	public static int lireFichierConfig(String typeVehicule) {
        if(typeVehicule.equals("T")) {
            return 0;
        }else if(typeVehicule.equals("M")) {
            return 1;
        }else {
        	return 2;
        }
	}

    public static FabriqueDeVehicules getFabrique() {
        int sys = lireFichierConfig("T");
        if(sys == 0) {
            return (new FabriqueV_Terrestre());
    	}else if(sys == 1) {
            return (new FabriqueV_Maritime());
    	}else {
    		return (new FabriqueV_Aerien());
    	}
    }
    
    public abstract Vehicule creerVehicule();
    
}
