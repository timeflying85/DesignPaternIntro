package be.decouverte.technifutur.superCanard;

public abstract class CanardInt implements Canard {

    private ComportementDeCancan comportementDeCancan;

    private ComportementDeVol comportementDeVol;

    protected CanardInt(ComportementDeCancan comportementDeCancan, ComportementDeVol comportementDeVol) {
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

    @Override
    public void nager() {
        System.out.println("plouf plouf");
    }

    @Override
    public void effectuerCancan() {
        this.comportementDeCancan.Cancaner();
    }

    @Override
    public void effectuerVol() {
        this.comportementDeVol.ComportementDeVol();
    }




}
