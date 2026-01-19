public class Bestallning {
    private int personummer;
    private int telefonnummer;
    
    public Bestallning(int personummer, int telefonnummer) {
        this.personummer = personummer;
        this.telefonnummer = telefonnummer;
    }

    public int getPersonummer() {
        return personummer;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    @Override
    public String toString() {
        return "Bestallning [personummer:" + personummer + ", telefonnummer:" + telefonnummer + "]";
    }

    
}
