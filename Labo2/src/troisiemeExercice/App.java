package troisiemeExercice;

public class App {

	public static void main(String[] args) {
		
		FabriqueAbstraite<?> fabriqueAbstraite;
		// creer une auto
		fabriqueAbstraite = FabriqueDeVehicule.getFabrique('T');
		VehiculeTerrestre uneAuto = (Auto) fabriqueAbstraite.creer("Auto");
		
		fabriqueAbstraite = FabriqueDeVehicule.getFabrique('M');
		VehiculeMaritime unCatamaran = (Catamaran) fabriqueAbstraite.creer("Catamaran");
		
		fabriqueAbstraite = FabriqueDeVehicule.getFabrique('A');
		VehiculeAerien uneMontgolfiere = (Montgolfiere) fabriqueAbstraite.creer("Montgolfiere");
		
		System.out.println("Je suis un "+uneAuto.getTypeVehicule()+
				           " de type "+uneAuto.getSousTypeVehicule()+", donc j'ai "+
				           uneAuto.getNbRoues()+" roues!");
		
		System.out.println("Je suis un "+unCatamaran.getTypeVehicule()+
		           " de type "+unCatamaran.getSousTypeVehicule()+", donc j'ai "+
		           unCatamaran.getNbCoques()+" coque(s)!");
		
		System.out.println("Je suis un "+uneMontgolfiere.getTypeVehicule()+
		           " de type "+uneMontgolfiere.getSousTypeVehicule()+", donc ma sustentation "+
		           "est "+uneMontgolfiere.getMoyenSustentation()+"!");

	}

}
