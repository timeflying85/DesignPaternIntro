package be.decouverte.technifutur.superCanard;

public class Leurre extends Canard{
    public Leurre(){
        super(new Cancan(), new VolerAvecDesAiles());
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un leurre");
    }

    @Override
    public void nager() {
        System.out.println("Je nage");
    }
}
