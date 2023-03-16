package be.decouverte.technifutur.superCanard;

public class CanardPlastique extends Canard{

    public CanardPlastique() {
        super(new CoinCoin(), new NePasVoler());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un canard en plastique");
    }

    @Override
    public void nager() {
        System.out.println("Je nage");
    }
}
