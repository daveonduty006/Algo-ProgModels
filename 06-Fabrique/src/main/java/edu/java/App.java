package main.java.edu.java;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Biscuit prot = new BiscuitAuChocolat("rond","noir");
        MachineDeBiscuits mdb = new MachineDeBiscuits(prot);
        for (int i = 0; i < 100; i++)
             System.out.println(mdb.faireBiscuit());
    }
}
