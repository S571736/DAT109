package no.hvl.DAT109;

import java.util.ArrayList;

public class Brett {
    public ArrayList<Rute> ruter = new ArrayList<Rute>();


    public Brett() {

        for (int i = 0; i < 100; i++) {
            Rute rute = new Rute(i);
            if (i == 0) {
                rute.setForrige(0);
            }
            ruter.add(rute);
        }
    }

    public void flyttBrikke(Brikke brikke, int plasser) {

    }
}
