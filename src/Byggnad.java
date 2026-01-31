public class Byggnad{
    private int pris;
    private String typ;

    public Byggnad(int pris, String typ) {
        this.pris = pris;
        this.typ = typ;
    }

    public int getPris() {
        return pris;
    }

    public String getTyp() {
        return typ;
    }

    @Override
    public String toString() {
        return "Byggnad [Pris:" + pris + ", Byggnad:" + typ + "]";
    }
}
