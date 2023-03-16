package be.decouverte.technifutur.superCanard;

public class Begayer implements ComportementDeCancan{

    private ComportementDeCancan cri;

    public Begayer(ComportementDeCancan cri) {
        this.cri = cri;
    }

    @Override
    public void Cancaner() {
        cri.Cancaner();
        cri.Cancaner();
    }



}
