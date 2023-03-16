package be.decouverte.technifutur.superCanard;

public class CanardAvecVagues implements Canard{

    private Canard parent;

    public CanardAvecVagues(Canard parent) {
        this.parent = parent;
    }

    @Override
    public void afficher() {
        System.out.println(" o< ");
        parent.afficher();
        System.out.println("( )");
    }

    @Override
    public void nager() {
        parent.nager();
    }

    @Override
    public void effectuerCancan() {
        parent.effectuerCancan();
    }

    @Override
    public void effectuerVol() {
        parent.effectuerVol();
    }
}
