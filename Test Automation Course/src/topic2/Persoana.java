package topic2;

public class Persoana {

    public String nume;
    private int virsta;
    private char gen;

    public Persoana (int virsta, char gen){

        this.virsta = virsta;
        this.gen = gen;
    }
    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public int getVirsta() {
        return virsta;
    }

    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }
}
