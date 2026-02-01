public class Villa extends Byggnad {
    private int rum;
    private int yta;
    private int badrum;
    private int kok;
    private int tomt;

    public Villa(int pris, String typ, int rum, int yta, int badrum, int kok, int tomt) {
        super(pris, typ);
        if (4 > rum || rum > 7 || 150 > yta || yta > 230 || 1 > badrum || badrum > 2 || 400 > tomt || tomt > 1000) {
            throw new IllegalArgumentException("Du har angett ogiltig information om order");
        }

        this.rum = rum;
        this.yta = yta;
        this.badrum = badrum;
        this.kok = kok;
        this.tomt = tomt;
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

    public int getKok() {
        return kok;
    }

    public int getTomt() {
        return tomt;
    }

    @Override
    public String toString() {
        return ", Pris:" + getPris() + ", Byggnad:" + getTyp() + ", Rum:" + rum + ", Yta:" + yta + ", Badrum:" + badrum
                + ", Kök:" + kok + ", Tomt:" + tomt;
    }
}
