package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Korpa {
    public final static int MAX_VALUE = 50;
    private Artikl[] niz = new Artikl[MAX_VALUE];
    private int broj = 0;

    public boolean dodajArtikl(Artikl a){
        if(broj == MAX_VALUE){
            return false;
        }else{
            niz[broj] = a;
            broj++;
            return true;
        }
    }
    public Artikl[] getArtikli(){
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
    public int dajUkupnuCijenuArtikala(){
        int sum = 0;
        for(int i = 0;i<broj;i++){
            sum = sum + niz[i].getCijena();
        }
        return sum;
    }

}
