package inheritance;

public class Main {
    public static void main(String[] args) {

        Masina vehiculNr1 = new Masina("Mercedes", "Albastra", 4);
        Vehicul vehiculNr2 = new Vehicul();


        vehiculNr2.setCuloare("Rosie");
        vehiculNr2.setNrRoti(3);
        vehiculNr2.afiseazaDetaliiVehicul();

        System.out.println();

        vehiculNr1.afiseazaDetaliiVehicul();


    }
}