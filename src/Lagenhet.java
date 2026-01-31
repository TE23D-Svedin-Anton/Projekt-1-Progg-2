public class Lagenhet{
    private int pris;
    private String typ;
    private int rum;
    private int yta;
    private int badrum;
    private int kok;

    public Lagenhet(int pris, String typ, int rum, int yta, int badrum, int kok) {
        this.pris = pris;
        this.typ = typ;
        this.rum = rum;
        this.yta = yta;
        this.badrum = badrum;
        this.kok = kok;
    }
    
    public int getPris() {
        return pris;
    }

    public String getTyp() {
        return typ;
    }

    public int getRum() {
        return rum;
    }
    public int getYta() {
        return yta;
    }
    public int getBadrum() {
        return badrum;
    }
    public int getKok() {
        return kok;
    }

    @Override
    public String toString() {
        return "Lägenhet [Pris:" + pris + ", Byggnad:" + typ + ", rum:" + rum + ", yta:" + yta + ", badrum:" + badrum + ", kök:" + kok + "]";
    }  
}
