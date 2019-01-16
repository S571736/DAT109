package no.hvl.DAT109;

import java.util.Random;

public class Terning {
    private Random r = new Random();

    public Terning() {
    }

    public int trill() {
        return r.nextInt(6) + 1;
    }
}
