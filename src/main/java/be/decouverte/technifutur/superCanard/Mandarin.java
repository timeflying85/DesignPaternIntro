package be.decouverte.technifutur.superCanard;

public class Mandarin extends Canard{
    public Mandarin() {
        super(new CoinCoin(), new VolerAvecDesAiles());
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un mandarin");
    }

    @Override
    public void nager() {
        System.out.println("Je nage");
    }
}
