package be.decouverte.technifutur;

import be.decouverte.technifutur.superCanard.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Canard> mare = Arrays.asList(
                new Colvert(),
                new Mandarin(),
                new CanardPlastique(),
                new Leurre(),
                new CanardEnPeluche()
        );

        for (Canard c : mare) {

            System.out.println("----------------------------------------- Next : ");
            System.out.println("");
            System.out.println("Who are you ? ");
            c.afficher();
            System.out.println("");
            System.out.println("What do you do into water ? ");
            c.nager();
            System.out.println("");
            System.out.println("Do you fly or not ? ");
            c.effectuerVol();
            System.out.println("");
            System.out.println("What sound do you do ? ");
            c.setComportementCancan(new Begayer(c.getComportementDeCancan()));
            c.effectuerCancan();



        }
    }
}