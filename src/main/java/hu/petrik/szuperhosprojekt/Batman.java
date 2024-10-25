package hu.petrik.szuperhosprojekt;

public class Batman implements Main.Szuperhos, Main.Milliardos {

    private float lelemenyesseg;
    private float szuperero;

    public Batman() {
        this.lelemenyesseg = 100;
        this.szuperero = this.lelemenyesseg * 2;
    }

    @Override
    public boolean legyoziE(Main.Szuperhos hero) {
        return hero.mekkoraAzEreje() > this.lelemenyesseg;
    }

    @Override
    public float mekkoraAzEreje() {
        return this.szuperero;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }


    @Override
    public String toString() {
        return "Batman " +
                "lelemenyesseg=" + lelemenyesseg +
                ", szuperero=" + szuperero;
    }
}