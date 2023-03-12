package encapsulation;

public class ContBancar {

    private int nrCont;
    private int sold;

    ContBancar() {
    }

    ContBancar(int nrCont, int sold) {

        this.nrCont = nrCont;
        this.sold = sold;
    }

    public void getNrCont() {

        System.out.println("Numarul contului este : " + nrCont);
    }

    public void getSold() {

        System.out.println("Soldul curent est : " + sold);
    }

    public void setNrCont(int nrCont) {

        this.nrCont = nrCont;
    }

    public void setSold(int sold) {

        this.sold = sold;

    }

}

