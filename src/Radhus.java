public class Radhus extends Byggnad{
    private int rum;
    private int yta;
    private int badrum;
    private int kok;
    private int tomt;

    public Radhus(int pris, String typ, int rum, int yta, int badrum, int kok, int tomt) {
        super(pris, typ);
        this.rum = rum;
        this.yta = yta;
        this.badrum = badrum;
        this.kok = kok;
        this.tomt = tomt;
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
    public int getTomt() {
        return tomt;
    }

    @Override
    public String toString() {
        return "Radhus [Pris:" + getPris() + ", Byggnad:" + getTyp() + ", Rum:" + rum + ", Yta:" + yta + ", Badrum:" + badrum + ", Kök:" + kok + ", Tomt:" + tomt + "]";
    }
}
