package polimorfism;

public class Caine extends Animal {

    public Caine() {
        setSay("hau-hau");

    }

    public void emiteSunet() {

        String say = super.getSay();
        System.out.println("Cainele emite sunetul : " + say);
    }
}
