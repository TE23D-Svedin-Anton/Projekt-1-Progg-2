public class Lagenhetshus extends Byggnader{
    int antalLägenheter;

    public Lagenhetshus(int pris, String byggnad, int antalLägenheter) {
        super(pris, byggnad);
        this.antalLägenheter = antalLägenheter;
    }

    public int getAntalLägenheter() {
        return antalLägenheter;
    }

    @Override
    public String toString() {
        return "Lagenhetshus [pris:" + pris + ", byggnad:" + byggnad + ", antalLägenheter:" + antalLägenheter + "]";
    }
}
