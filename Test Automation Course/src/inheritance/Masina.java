package inheritance;

public class Masina extends Vehicul {

    private String marca;

    public Masina (String marca, String culoare, int nrRoti) {

        super(culoare,nrRoti);
        this.marca = marca;

    }
    public void afiseazaDetaliiVehicul() {

        System.out.println("Marca masinii este : " + marca + ".");

        String culoare = super.getCuloare();
        System.out.println("Culoarea masinii este : " + culoare + ".");

        Integer nrRoti = super.getNrRoti();
        System.out.println("Nr de roti a masinii este : " + nrRoti + ".");

    }

}

