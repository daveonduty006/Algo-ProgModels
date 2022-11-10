public class Main {

	public static void main(String[] args) {
		double base = 2;
		int exposant = -4;
		String rep;
		double resultat = expRecursif(base, Math.abs(exposant));
		if (exposant < 0) {
		    rep = String.format("%.2f", (1 / resultat));
		}else {
		    rep = String.valueOf(resultat);
		}
		System.out.println("Le resultat de "+base+" puissance "+exposant+" = "+rep);

	}
	// Cas 1: facon iterative
	public static double expIter(double base, int exposant) {
	    double reponse = 1;
	    for (;exposant >= 1;--exposant) {
	        reponse*=base;
	    }
	    return reponse;
	}
	// Cas 2: facon recursive
	public static double expRecursif(double base, int exposant) {
	    // Condition d'arret
	    if (exposant == 0) {
	        return 1;
	    }else {
	    	return base*expRecursif(base,exposant-1);
	    } 
	}
	
}
