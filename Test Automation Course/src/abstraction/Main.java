package abstraction;

public class Main {
    public static void main(String[] args) {

        Triunghi triunghi1 = new Triunghi(3.3F, 4.2F, 5);
        Patrat patrat1 = new Patrat(2.2F, 2.2F, 2.2F, 2.2F);

        triunghi1.calculArie();
        System.out.println();
        patrat1.calculArie();

    }
}