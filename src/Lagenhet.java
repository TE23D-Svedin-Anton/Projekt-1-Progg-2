public class Lagenhet extends Lagenhetshus{
    int rum;
    int yta;
    int badrum;
    int kök;
    
    public Lagenhet(int pris, String byggnad, int antalLägenheter, int rum, int yta, int badrum, int kök) {
        super(pris, byggnad, antalLägenheter);
        this.rum = rum;
        this.yta = yta;
        this.badrum = badrum;
        this.kök = kök;
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

    @Override
    public String toString() {
        return "Lagenhet [pris:" + pris + ", byggnad:" + byggnad + ", antalLägenheter:" + antalLägenheter + ", rum:"
                + rum + ", yta:" + yta + ", badrum:" + badrum + ", kök:" + kök + "]";
    }  
}
