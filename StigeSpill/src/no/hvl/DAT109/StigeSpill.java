package no.hvl.DAT109;

import java.util.ArrayList;

public class StigeSpill {
    public Brett brett;
    public ArrayList<Spiller> spillere = new ArrayList<Spiller>();
    public Terning terning;
    private Spiller enSpiller;
    private boolean status = false;

    public Spiller opprettSpiller(String spillernavn) {
        //TODO
        Spiller spiller = new Spiller(spillernavn);
        return spiller;
    }

    public void init(){
        //opprettSpiller("Solo");
        enSpiller.getBrikke().setPos(0);
    }

    public void spillRundeMan() {
        //TODO
    }

    public void spillRundeAuto(){
        while(status==false){

        }
    }
}
