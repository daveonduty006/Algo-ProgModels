package Partie2;

public class gestionComptes {
	
	public static journalisation uneJournalisation = journalisation.getJournalisation(); // on récupère le singleton de la classe journalisation

	public static void main(String[] args) {
		
		 compteBancaire compte123 = new compteBancaire(123); // création des comptes 
		 compteBancaire compte321 = new compteBancaire(321);
		 
		 compte123.deposerArgent(100);                                      // opérations dans les comptes
		 journalisation.ajouterLog("depot de 100$ dans le compte 123");
		 compte123.retirerArgent(80);
		 journalisation.ajouterLog("retrait de 80$ dans le compte 123");
		 
		 compte321.deposerArgent(200);
		 journalisation.ajouterLog("depot de 200$ dans le compte 321");
		 compte321.deposerArgent(110);
		 journalisation.ajouterLog("retrait de 110$ dans le compte 321");
		 
		 for(int i=0; i < journalisation.getLogs().size(); i++) { // affichage de tout les logs dans le tableau du singleton journalisation
			 System.out.println(journalisation.getLogs().get(i));
		 }
		 

	}

}
