package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Main.Milliardos {


    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();
        this.setSzuperero(this.getSzuperero() + random.nextFloat(11));
    }

    @Override
    public String toString() {
        return "Vasember" +
                "szuperero=" + this.getSzuperero() +
                ", vanEGyengesege=" + this.isVanEGyengesege();
    }
}