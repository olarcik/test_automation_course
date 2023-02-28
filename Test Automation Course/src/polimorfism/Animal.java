package polimorfism;

public class Animal {
    private String say = "beeeeee";


    public String getSay() {

        return say;
    }

    public void setSay(String say) {

        this.say = say;
    }

    public void emiteSunet() {

        System.out.println("Animalul ne stiut emite sunetul : " + say);
    }
}
