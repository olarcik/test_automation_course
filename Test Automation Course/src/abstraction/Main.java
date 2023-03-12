package abstraction;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Triunghi triunghi1 = new Triunghi(3.3F, 4.2F, 5);
        Patrat patrat1 = new Patrat(2.2F, 2.2F, 2.2F, 2.2F);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Aria triunghiului este " + df.format(triunghi1.calculArie()));
        System.out.println();
        System.out.println("Aria patratului este " + df.format(patrat1.calculArie()));

    }
}