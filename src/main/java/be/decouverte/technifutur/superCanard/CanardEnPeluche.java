package be.decouverte.technifutur.superCanard;

public class CanardEnPeluche extends Canard{
    public CanardEnPeluche(){
        super(new Muet(), new NePasVoler());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un canard en peluche");
    }

    @Override
    public void nager() {
        System.out.println("Je nage");
    }
}
