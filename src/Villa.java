public class Villa extends Byggnader{
    private int rum;
    private int yta;
    private int badrum;
    private int kök;
    private int tomt;

    public Villa(int pris, String byggnad, int rum, int yta, int badrum, int kök, int tomt) {
        super(pris, byggnad);
        this.rum = rum;
        this.yta = yta;
        this.badrum = badrum;
        this.kök = kök;
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
    public int getKök() {
        return kök;
    }
    public int getTomt() {
        return tomt;
    }

    @Override
    public String toString() {
        return "Villa [pris:" + getPris() + ", byggnad:" + getByggnad() + ", rum:" + rum + ", yta:" + yta + ", badrum:" + badrum
                + ", kök:" + kök + ", tomt:" + tomt + "]";
    }
}
