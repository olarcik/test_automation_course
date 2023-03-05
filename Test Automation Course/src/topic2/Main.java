package topic2;

public class Main {
    public static void main(String[] args) {

        Persoana om = new Persoana(24,'M');

        om.nume = "Vlad";

        System.out.println("Numele persoanei este "  + om.nume);
        System.out.println("Virsta persoanei este "  + om.getVirsta() + " ani");
        System.out.println("Genul persoanei este - " + om.getGen());


    }
}
