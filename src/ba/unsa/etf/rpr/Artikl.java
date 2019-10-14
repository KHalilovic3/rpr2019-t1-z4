package ba.unsa.etf.rpr;

public class Artikl {
    private String kod;
    private int cijena;
    private String naziv;
    public Artikl(int cijena, String naziv, String kod) {
        this.cijena = cijena;
        this.naziv = naziv;
        this.kod = kod;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
    final int getCijena(){
        return cijena;
    }
    final String getKod(){
        return kod;
    }
    final String getNaziv(){
        return naziv;
    }
}
