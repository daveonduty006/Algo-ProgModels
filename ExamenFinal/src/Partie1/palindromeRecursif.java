package Partie1;

public class palindromeRecursif {
	
	public static void main(String[] args) {
		System.out.println(estPalindrome("roma amor"));
	}


	public static boolean estPalindrome(String mot) {
		if(mot.length() == 1) {
			return true;
		}
		boolean check = false;
		boolean check2 = true;
		int longueur = mot.length();
		if(mot.charAt(0) == mot.charAt(longueur-1)) {
			String nouveauMot = mot.substring(1, longueur-1);
			check = estPalindrome(nouveauMot);
			if(check) {
				check = check2;
			}
		}
		return check;
	}

}
