package no.hvl.DAT109.test;

import no.hvl.DAT109.Terning;

class TerningTest {
    private static int ANTALL_KAST = 10000000;
    Terning t = new Terning();

    @org.junit.jupiter.api.Test
    void trill() {
        for (int i = 0; i < ANTALL_KAST; i++) {
            int resultat = t.trill();

            assert (resultat >= 1 && resultat <= 6);
        }
    }
}