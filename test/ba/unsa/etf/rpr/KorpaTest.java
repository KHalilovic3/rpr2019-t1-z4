package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;

    @BeforeEach
    void setup(){this.korpa = new Korpa();}

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("test",1,"1");
        this.korpa.dodajArtikl(a);
        Assertions.assertEquals(1,korpa.getBroj());
        for(int i = 0;i<korpa.getBroj();i++){
            Assertions.assertNotNull(korpa.getArtikli()[i]);
        }
    }

    @Test
    void getArtikli() {
        Artikl a = new Artikl("test",1,"1");
        this.korpa.dodajArtikl(a);
        Artikl[] niz = new Artikl[1];
        niz[0]= new Artikl("test",1,"1");
        Assertions.assertEquals(niz,korpa.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {

    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}