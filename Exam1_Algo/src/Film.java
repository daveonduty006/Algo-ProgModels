public class Film {
	
    /////////////////////////////
	
    /////////////////////////////
	
    private int num;
    private String titre, realisateur;
    private int duree;
    
    /////////////////////////////

    Film() {
        this.num= 0;
        this.titre= "";
        this.realisateur= "";
        this.duree= 0;
    }

    Film(int num, String titre, String realisateur, int duree) {
        this.num= num;
        this.titre= titre;
        this.realisateur= realisateur;
        this.duree= duree;
    }

    /////////////////////////////
    
    public int getNum() {
        return this.num;
    }
    
    public String getTitre() {
        return this.titre;
    }
    
    public String getRealisateur() {
        return this.realisateur;
    }
    
    public int getDuree() {
        return this.duree;
    }
  
    /////////////////////////////

    public void setNum(int num) {
        this.num= num;
    }

    public void setTitre(String titre) {
        this.titre= titre;
    }
    
    public void setRealisateur(String realisateur) {
        this.realisateur= realisateur;
    }

    public void setDuree(int duree) {
        this.duree= duree;
    }
    
    /////////////////////////////

    @Override
    public String toString(){
        String rep= "\nNUMÉRO= "+this.num;
        rep+="\nTITRE= "+this.titre;
        rep+="\nRÉALISATEUR= "+this.realisateur;
        rep+="\nDURÉE= "+this.duree;
        rep+="\n********************************";
        return rep;
    }
    
}