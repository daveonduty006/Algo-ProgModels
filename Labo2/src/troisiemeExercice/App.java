package troisiemeExercice;

public class App {

	public static void main(String[] args) {
		
		FabriqueAbstraite fabriqueAbstraite;
		// creer une auto
		fabriqueAbstraite = FabriqueDeVehicule.getFabrique('T');
		VehiculeTerrestre uneAuto = (Auto) fabriqueAbstraite.creer("Auto");
		
		System.out.println("Je suis un "+uneAuto.getTypeVehicule()+
				           " de type "+uneAuto.getSousTypeVehicule()+", donc j'ai "+
				           uneAuto.getNbRoues()+" roues!");

	}

}
