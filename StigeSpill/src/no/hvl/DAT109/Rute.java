package no.hvl.DAT109;

public class Rute {
    private int ruteNr;
    private int forrigeRute;
    private int nesteRute;
    private int stigeLengde;

    public Rute(int ruteNr) {
        this.ruteNr = ruteNr;
        this.forrigeRute = ruteNr--;
        this.nesteRute = ruteNr++;
    }

    public Rute(int ruteNr, int stigeTil) {
        this.ruteNr = ruteNr;
        this.forrigeRute = ruteNr--;
        this.nesteRute = ruteNr++;

    }

    public void setRuteNr(int ruteNr) {
        this.ruteNr = ruteNr;
    }

    public int getRuteNr() {
        return ruteNr;
    }
}
