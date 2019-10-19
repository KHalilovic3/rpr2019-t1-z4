package ba.unsa.etf.rpr;
import java.util.Arrays;
public class Supermarket {
    public final static int MAX_VALUE = 1000;
    private Artikl[] niz = new Artikl[MAX_VALUE];
    private int broj = 0;

    public void dodajArtikl(Artikl a) {
        niz[broj] = a;
        broj++;
    }

    public Artikl[] getArtikli() {
        return niz;
    }
    public Artikl izbaciArtiklSaKodom(String a){
        for(int i = 0;i<broj;i++){

            if(niz[i].getKod().equals(a)){
                Artikl[] b = Arrays.copyOf(niz,niz.length);
                System.arraycopy(niz,i+1,niz,i,broj - 1 - i);
                broj= broj - 1;
                return b[i];
            }
        }
        return null;
    }

}
