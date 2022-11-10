public abstract class FabriqueDeInterfaces {
    public static int lireFichierDeConfig(String typeSE) {
        if(typeSE.equals("Win")){
            return 0;
        }else {
            return 1;
        }
    }
    public static FabriqueDeInterfaces getFabrique() {
        int sys = lireFichierDeConfig("Win");
        if (sys == 0)
            return (new FabriqueWin());
        else
            return (new FabriqueMac());
    }

    public abstract Buton creerButon();
}
