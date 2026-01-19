public class Bestallning {
    int pris;
    String byggnad;
    int personummer;
    
    public Bestallning(int pris, String byggnad, int personummer) {
        this.pris = pris;
        this.byggnad = byggnad;
        this.personummer = personummer;
    }

    public int getPris() {
        return pris;
    }

    public String getByggnad() {
        return byggnad;
    }

    public int getPersonummer() {
        return personummer;
    }

    @Override
    public String toString() {
        return "Bestallning [pris:" + pris + ", byggnad:" + byggnad + ", personummer:" + personummer + "]";
    }

    
}
