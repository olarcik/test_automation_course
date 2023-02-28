package topic2;

public class Main {
    public static void main(String[] args) {

        Persoana om = new Persoana();

        om.nume = "Vlad";
        om.virsta = 24;
        om.setGen('M');

        System.out.println("Numele persoanei este " + om.nume);
        System.out.println("Virsta persoanei este " + om.virsta + " ani");
        System.out.println("Genul persoanei este - " + om.getGen());


    }
}
