
public class Exercice2 {
		
	public static void main(String[] args) {
		double base = 2;
		int exposant = 8;
		System.out.println(exp(base, exposant));
	}

	public static double exp(double base, int exposant) {
		if(exposant == 0) {
			return 1;
		}
		if(exposant == 1) {
		    return base;
		}
		if(exposant % 2 == 0) {
		    return exp(base, exposant/2) * exp(base, exposant/2);
		}    
		else {
		    return exp(base * base, exposant/2) * base;
		}
	}

}
