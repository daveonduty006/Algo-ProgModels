package Partie1;

public class palindromeRecursif {
	
	public static void main(String[] args) {
		System.out.println(estPalindrome("Otto"));
		System.out.println(estPalindrome("Roma Amor"));
		System.out.println(estPalindrome("Laval"));
		System.out.println(estPalindrome("Otoo"));
		System.out.println(estPalindrome("Roma Amore"));
		System.out.println(estPalindrome("Lavall"));
	}


	public static boolean estPalindrome(String mot) {
		mot = mot.toLowerCase();
		if(mot.length() == 0 || mot.length() == 1) {
			return true;
		}
		boolean check = false;
		int longueur = mot.length();
		if(mot.charAt(0) == mot.charAt(longueur-1)) {
			mot = mot.substring(1, longueur-1);
			check = estPalindrome(mot);
		}
		return check;
	}

}
