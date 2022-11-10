package main.java.edu.java;


/* Prototype concrets à copier */
public class BiscuitAuChocolat extends Biscuit {
    Biscuit unBiscuit;
    String typeChocolat; // lait, noix, ...

    BiscuitAuChocolat(String forme, String typeChocolat){
      
        this.unBiscuit = super.clone();
        this.unBiscuit.setForme(forme);
        this.unBiscuit.setType("chocolat");
        this.typeChocolat = typeChocolat;
    }

  public String toString(){

    return "[ Forme = "+ this.unBiscuit.getForme() + ",   Type = "+ this.unBiscuit.getType() + ",   Type = "+this.typeChocolat+" ]\n";
  }
}
