package main.java.edu.java;

public class MachineDeBiscuits {
    private Biscuit unBiscuit;

    public MachineDeBiscuits(Biscuit unBiscuit)
    { 
        this.unBiscuit = unBiscuit; 
    }

    public Biscuit faireBiscuit() {
        return unBiscuit.clone();
    }
}
