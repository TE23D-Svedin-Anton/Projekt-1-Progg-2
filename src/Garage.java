public class Garage extends Byggnad{
    private int bilArea;
    private int föradsVolym;
    
    public Garage(int pris, String typ, int bilArea, int föradsVolym) {
        super(pris, typ);
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
        return "Garage [Pris:" + getPris() + ", Byggnad:" + getTyp() + ", Bilarea:" + bilArea + ", FörådsVolym:" + föradsVolym + "]";
    }
}
