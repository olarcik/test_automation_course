package topic6;

public class Main {

    public static void main(String[] args) {

        ContulPersoanei cont1 = new ContulPersoanei("Olaru Vladislav",565678,50000);

        System.out.println("Buna ziua " + cont1.getNumePersoana() + "!");
        System.out.println("ID Contului dnv este " + cont1.getId());
        System.out.println("Suma initiala solicitata de creditare este " + cont1.getSumaCurenta() + " lei.");
        System.out.println();

        cont1.sustragereDeBane();
    }
}
