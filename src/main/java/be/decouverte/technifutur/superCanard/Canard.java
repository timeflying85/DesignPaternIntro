package be.decouverte.technifutur.superCanard;

public abstract class Canard {

    private ComportementDeCancan comportementDeCancan;

    private ComportementDeVol comportementDeVol;

    protected Canard(ComportementDeCancan comportementDeCancan, ComportementDeVol comportementDeVol) {
        this.comportementDeCancan = comportementDeCancan;
        this.comportementDeVol = comportementDeVol;
    }

    public void setComportementCancan(ComportementDeCancan comportementDeCancan){
        this.comportementDeCancan = comportementDeCancan;
    };

    public void setComportementDeVol(ComportementDeVol comportementDeVol){
        this.comportementDeVol = comportementDeVol;
    };

    public ComportementDeCancan getComportementDeCancan() {
        return comportementDeCancan;
    }

    public ComportementDeVol getComportementDeVol() {
        return comportementDeVol;
    }

    public abstract void afficher();

    public void nager() {
        System.out.println("plouf plouf");
    }

    public void effectuerCancan() {
        this.comportementDeCancan.Cancaner();
    }

    public void effectuerVol() {
        this.comportementDeVol.ComportementDeVol();
    }




}
