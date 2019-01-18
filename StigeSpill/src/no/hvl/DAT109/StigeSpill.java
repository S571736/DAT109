package no.hvl.DAT109;

import java.util.ArrayList;

public class StigeSpill {
    public Integer[] brett = new Integer[100];
    public ArrayList<Spiller> spillere = new ArrayList<Spiller>();
    public Terning terning;
    private Spiller enSpiller;
    private boolean status = false;

    public Spiller opprettSpiller(String spillernavn) {
        //TODO
        Spiller spiller = new Spiller(spillernavn);
        return spiller;
    }

    private void init(){
        //opprettSpiller("Solo");
        enSpiller.getBrikke().setPos(0);
    }

    private void spillRundeMan() {
        //TODO
    }

    private void spillRundeAuto(){
        while(status==false){
            int pos = enSpiller.getBrikke().getPos();

        }
    }
}
