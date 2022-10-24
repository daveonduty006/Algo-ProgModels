public class ListeChaineeFilms extends ListeChainee {
	
    ListeChaineeFilms() {
        super();
    }
    
    public Noeud rechercher(int num){
        Noeud pt = tete;    
        while(pt != null){
            if( ((Film) pt.infos).getNum() == num){
                return pt;// Pour sortir de la boucle
            }else {
                pt = pt.suiv;
            }
        }
        return pt;
    }
    
    public void supprimerFilm(int num){
        Noeud posObj = rechercher(num);
       
        if(posObj == null){
            System.out.println("Objet introuvable");
        } else if(posObj == this.tete){// Cas si on supprime le premier noeud
            this.tete = this.tete.suiv;
        }else if(posObj == this.queue){// Cas où on supprime le dernier noeud
            posObj.prec.suiv = posObj.suiv;
        }else {// Cas où on supprime un élément autre que le premier ou dernier noeud
            posObj.prec.suiv = posObj.suiv;
            posObj.suiv.prec = posObj.prec;
        }
        this.taille--;
    }
    
    public void modifierTitre(int num, String nouveauTitre){
        Noeud posObj = rechercher(num);
        if(posObj == null){
            System.out.println("\nLivre inexistant!");
        }else {
          
        	((Film) posObj.infos).setTitre(nouveauTitre);
        }
    }
    
    

    /*
    public void modifierTitre(Livre leLivre, String titre){
        Noeud pt = GestionLivres.listeLivres.rechercher(leLivre);
        if(pt == null){
            System.out.println("\nLivre inexistant!");
        }else {
          ((Livre)  pt.infos).setTitre(titre);
        }
    }

    public Livre chercherLivreParNumero(int numTrouver){
        ListeChaineeLivres listeLivres = GestionLivres.listeLivres;
        Noeud pt = listeLivres.tete;
        boolean trouve = false;
        while(pt != null && !trouve){
            if(((Livre)  pt.infos).getNum() == numTrouver){
                trouve = true;
            } else{
                pt = pt.suiv;
            }
        }
        if (trouve){
            return ((Livre)  pt.infos);
        }else {
            return null;
        }
    }
    */
    
}