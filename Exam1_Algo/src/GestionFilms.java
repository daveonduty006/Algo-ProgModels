public class GestionFilms {
	
    static ListeChaineeFilms listeFilms;
    static Film unFilm1;
    static Film unFilm2;
    static Film unFilm3;
    static Film unFilm4;
    static Film unFilm5;
    
    public static void main(String[] args) throws Exception {  	
        listeFilms= new ListeChaineeFilms();
        chargerListeFilms();
        
        //lister();
        
        //supprimer();
        //lister();
        
        //modifier();
        //lister();
        
        //System.out.println("\nPosition dans la liste= "+trouver(unFilm5));
        //System.out.println("\nPosition dans la liste= "+trouver(new Film(600, "La méthode Agile", "Jean-Pierre Fiset", 180)));
        
    }
    
    public static void chargerListeFilms() {
        unFilm1= new Film(100, "Un bon film", "Steven Spielberg", 90);
        unFilm2= new Film(200, "Tour du soleil", "James Cameron", 120);
        unFilm3= new Film(300, "Le langage Java", "Antonio Tavares", 180);
        unFilm4= new Film(400, "Le langage Python", "Keven Presseau-St-Laurent", 180);
        unFilm5= new Film(500, "Le gentil élève", "David Normandin", 60);
        listeFilms.ajouter(unFilm1);
        listeFilms.ajouter(unFilm2);
        listeFilms.ajouter(unFilm3);
        listeFilms.ajouter(unFilm4);
        listeFilms.ajouter(unFilm5);
    }
    
    public static void lister() {
    	listeFilms.afficher();
    }
    
    public static void supprimer() {
    	listeFilms.supprimerFilm(unFilm1.getNum());
    }
    
    public static void modifier() {
    	listeFilms.modifierTitre(unFilm2.getNum(), "Tour de la lune");
    }
    
    public static int trouver(Film unFilm) {
    	int pos= listeFilms.positionDe(unFilm);
    	if(pos != -1) {
    		System.out.println(unFilm.toString());
    	}else {
    		System.out.println("Film non-présent dans la liste");
    	}
    	return pos;
    }
    	
    
/*
        Livre L1 = (Livre) listeLivres.rechercher(unLivre1).infos;
        System.out.println("\n**** INFOS DU unLivre1 ****");
        System.out.println(L1);
        System.out.println("\n**** LISTE DES LIVRES ****");
        listeLivres.afficher();
        System.out.println("\n**** ENLEVER LE unLivre1 ****");

        listeLivres.supprimer(unLivre2);
        System.out.println("\n**** LISTE DES LIVRES ****");
        listeLivres.afficher();
        System.out.println("\n**** Modifier le titre du livre unLivre3 ****");
        listeLivres.modifierTitre(unLivre3, "Espérons que cela puisse fonctionner!");
        System.out.println("\n**** LISTE DES LIVRES ****");
        listeLivres.afficher();
        System.out.println("\n**** Chercher par numéro ****");
        Livre leLivre = listeLivres.chercherLivreParNumero(300);
        if(leLivre == null){
            System.out.println("Le livre est introuvable");
        } else {
            System.out.println(leLivre);
        }

    }
*/
    
}