package topic4;

public class ExecuteMethods {

    public static void main(String[] args) {

        //Suma numerelor de la 'a' la 'b' folosind instructiunea 'FOR'
        System.out.println("Sarcina 1.Suma numerelor de la 'a' la 'b' folosind instructiunea 'FOR'.");
        System.out.println();
        System.out.println("Suma numerelor este " + Methods.sum(7,9) + ".");
        System.out.println("-----------------------------------------------------");

        //Suma numelerelo de la 0 la 'a' folosind instructiunea 'While'
        System.out.println("Sarcina 2.Suma numelerelo de la 0 la 'a' folosind instructiunea 'While'.");
        System.out.println();
        Methods.sum(-5);
        System.out.println("-----------------------------------------------------");

        //Atribuirea categoriei de virsta dupa ani
        System.out.println("Sarcina 3.Atribuirea categoriei de virsta dupa ani.");
        System.out.println();
        Persoana persNum1 = new Persoana("Ion", 15);
        Persoana persNum2 = new Persoana("Marcela", 20);
        Persoana persNum3 = new Persoana("Vasile", 45);
        Persoana persNum4 = new Persoana("Larisa", 65);

        System.out.println("Numele persoanei este " + persNum1.getNumePersoana() + " si are " + persNum1.getVirstaPersoana() + " ani." );
        persNum1.categoriePersoana();
        System.out.println();


        System.out.println("Numele persoanei este " + persNum2.getNumePersoana() + " si are " + persNum2.getVirstaPersoana() + " ani." );
        persNum2.categoriePersoana();
        System.out.println();


        System.out.println("Numele persoanei este " + persNum3.getNumePersoana() + " si are " + persNum3.getVirstaPersoana() + " ani." );
        persNum3.categoriePersoana();
        System.out.println();

        System.out.println("Numele persoanei este " + persNum4.getNumePersoana() + " si are " + persNum4.getVirstaPersoana() + " ani." );
        persNum4.categoriePersoana();
        System.out.println();
    }
}
