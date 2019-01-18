package no.hvl.DAT109;

import java.util.ArrayList;

public class StigeSpill {
    public Brett brett;
    public ArrayList<Spiller> spillere = new ArrayList<Spiller>();
    public Terning terning;

    public Spiller opprettSpiller(String spillernavn) {
        //TODO
        Spiller spiller = new Spiller(spillernavn);
        return spiller;
    }

    public void spillRunde() {
        //TODO
    }
}
