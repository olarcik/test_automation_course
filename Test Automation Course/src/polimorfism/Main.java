package polimorfism;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.emiteSunet();

        Pisica animal2 = new Pisica();
        animal2.emiteSunet();

        Caine animal3 = new Caine();
        animal3.emiteSunet();

    }
}
