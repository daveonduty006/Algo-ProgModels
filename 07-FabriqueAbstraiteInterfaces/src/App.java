public class App {
    public static void main(String[] args) throws Exception {
        FabriqueDeInterfaces uneFabrique = FabriqueDeInterfaces.getFabrique();
        Buton unButon = uneFabrique.creerButon();
        unButon.setCaption("Jouer");
        unButon.paint();
    }
}
