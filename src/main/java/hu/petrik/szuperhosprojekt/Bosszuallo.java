package hu.petrik.szuperhosprojekt;

import jdk.jshell.spi.ExecutionControl;


public abstract class Bosszuallo implements Main.Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Main.Szuperhos hero) throws ExecutionControl.NotImplementedException {
        if (hero.getClass() == Main.Batman.class) {
            return this.szuperero >= hero.mekkoraAzEreje() * 2;
        } else if (hero.getClass() == Bosszuallo.class) {
            return (this.szuperero > hero.mekkoraAzEreje() && Bosszuallo.class.cast(hero).isVanEGyengesege());
        } else {
            throw new ExecutionControl.NotImplementedException("Nincs ilyen class");
        }
    }

    @Override
    public float mekkoraAzEreje() {
        return this.szuperero;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }


    private static String fmt(float d) {
        if (d == (long) d)
            return String.format("%f", (long) d);
        else
            return String.format("%s", d);
    }

    @Override
    public String toString() {
        return "Szupererő: " + fmt(this.szuperero) + ";" + (this.isVanEGyengesege() ? "van" : "nincs") + " gyengesége";
    }
}
