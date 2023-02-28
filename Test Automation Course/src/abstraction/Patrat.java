package abstraction;


import java.text.DecimalFormat;

public class Patrat extends FormaGeometrica {

    private float laturaUnu;
    private float laturaDoi;
    private float laturaTrei;

    private float laturaPatru;

    private double aria = 0;


    public Patrat(float laturaUnu, float laturaDoi, float laturaTrei, float laturaPatru) {
        this.laturaUnu = laturaUnu;
        this.laturaDoi = laturaDoi;
        this.laturaTrei = laturaTrei;
        this.laturaPatru = laturaPatru;
    }

    @Override
    public void calculArie() {
        int nrError = 0;
        float[] arrayA = {laturaUnu, laturaDoi, laturaTrei, laturaPatru};
        for (int i = 0; i < arrayA.length - 1; i++) {
            if (arrayA[i] != arrayA[i + 1]) {
                nrError++;
            }
        }
        if (nrError > 0) {
            System.out.println("Aceasta figurat nu este un patrat, reporniti programul cu date veridice.");
        } else {

            System.out.println("Aceasta figura este un patrat.");
            aria = laturaUnu * laturaDoi;
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            System.out.println("Aria patratului este : " + df.format(aria));

        }


    }
}
