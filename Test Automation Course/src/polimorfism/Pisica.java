package polimorfism;

public class Pisica extends Animal {


    public Pisica() {
        setSay("miau-miau");

    }

    public void emiteSunet() {

        String say = super.getSay();
        System.out.println("Pisica emite sunetul : " + say);
    }


}
