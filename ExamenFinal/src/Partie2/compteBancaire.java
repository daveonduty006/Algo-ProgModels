package Partie2;

public class compteBancaire {
	
	private int numero;
	private double solde;

	public compteBancaire(int unNumero) {
		this.numero = unNumero;
		this.solde = 0;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public void deposerArgent(double depot) {
		this.solde += depot;
	}
	
	public void retirerArgent(double retrait) {
		this.solde -= retrait;
	}

}
