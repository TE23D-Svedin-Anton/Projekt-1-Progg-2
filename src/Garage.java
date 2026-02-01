public class Garage extends Byggnad{
    private int bilArea;
    private int foradsArea;
    
    public Garage(int pris, String typ, int bilArea, int foradsArea) {
        super(pris, typ);
        if( 15 > bilArea || bilArea > 30 || 150 > foradsArea || foradsArea > 230) {
            throw new IllegalArgumentException("Du har angett ogiltig information om order");
        }
        this.bilArea = bilArea;
        this.foradsArea = foradsArea;
    }

    public int getBilArea() {
        return bilArea;
    }

    public int getForadsArea() {
        return foradsArea;
    }

    @Override
    public String toString() {
        return ", Pris:" + getPris() + ", Byggnad:" + getTyp() + ", Bilarea:" + bilArea + ", FörådsArea:" + foradsArea + "]";
    }
}
