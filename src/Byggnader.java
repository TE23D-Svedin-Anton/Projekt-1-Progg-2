public class Byggnader {
    int pris;
    String byggnad;

    public Byggnader(int pris, String byggnad) {
        this.pris = pris;
        this.byggnad = byggnad;
    }

    public int getPris() {
        return pris;
    }

    public String getByggnad() {
        return byggnad;
    }

    @Override
    public String toString() {
        return "Byggnader [pris:" + pris + ", byggnad:" + byggnad + "]";
    }
}
