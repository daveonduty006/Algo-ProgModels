package main.java.edu.java;

/* Classe Prototype */
public class Biscuit implements Cloneable {
    public String forme="";// rond, carré, triangulaire, ...
    public String type=""; // vanille, chocolat, noix de coco, banane, ...
    
    public String getForme() {
        return this.forme;
    }

    public String getType() {
        return this.type;
    }

    public void setForme(String forme){
        this.forme = forme;
    }

    public void setType(String type){
        this.type = type;
    }

    public Biscuit clone() {
        try {
            Biscuit copie = (Biscuit) super.clone();
            return copie;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
