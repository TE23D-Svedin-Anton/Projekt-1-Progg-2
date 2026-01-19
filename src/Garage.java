public class Garage extends Byggnader{
    int bilArea;
    int föradsVolym;
    
    public Garage(int pris, String byggnad, int bilArea, int föradsVolym) {
        super(pris, byggnad);
        this.bilArea = bilArea;
        this.föradsVolym = föradsVolym;
    }

    public int getBilArea() {
        return bilArea;
    }

    public int getFöradsVolym() {
        return föradsVolym;
    }

    @Override
    public String toString() {
        return "Garage [pris:" + pris + ", byggnad:" + byggnad + ", bilArea:" + bilArea + ", föradsVolym:" + föradsVolym
                + "]";
    }
}
