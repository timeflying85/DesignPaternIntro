package be.decouverte.technifutur.superCanard;

public class Colvert extends Canard{

    public Colvert() {
        super(new CoinCoin(), new VolerAvecDesAiles());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un colvert");
    }

    @Override
    public void nager() {
        System.out.println("Je nage");
    }



}
