public class Lagenhetshus extends Byggnad{
    private int antalLagenheter;

    public Lagenhetshus(int pris, String typ, int antalLagenheter) {
        super(pris, typ);
        this.antalLagenheter = antalLagenheter;
    }

    public int getAntalLagenheter() {
        return antalLagenheter;
    }

    @Override
    public String toString() {
        return "Lägenhetshus [Pris:" + getPris() + ", Byggnad:" + getTyp() + ", Antal_Lägenheter:" + antalLagenheter + "]";
    }
}
