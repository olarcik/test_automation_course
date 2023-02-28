package inheritance;

public class Vehicul {

    private String culoare;
    private int nrRoti;

    public String getCuloare() {

        return culoare;
    }

    public void setCuloare(String culoare) {

        this.culoare = culoare;
    }

    public int getNrRoti() {

        return nrRoti;
    }

    public void setNrRoti(int nrRoti) {

        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul() {

        System.out.println("Culoarea vehiculului necunoscut este : " + culoare + ".");
        System.out.println("Vehiculul are : " + nrRoti + " roti.");
    }
}
