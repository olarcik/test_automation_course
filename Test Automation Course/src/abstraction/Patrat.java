package abstraction;

public class Patrat extends FormaGeometrica {

    private float laturaUnu;
    private float laturaDoi;
    private float laturaTrei;

    private float laturaPatru;

    public Patrat(float laturaUnu, float laturaDoi, float laturaTrei, float laturaPatru) {

        this.laturaUnu = laturaUnu;
        this.laturaDoi = laturaDoi;
        this.laturaTrei = laturaTrei;
        this.laturaPatru = laturaPatru;
    }

    @Override
    public float calculArie() {

        int nrError = 0;
        float aria = 0;
        float[] arrayA = {laturaUnu, laturaDoi, laturaTrei, laturaPatru};

        for (int i = 0; i < arrayA.length - 1; i++) {

            if (arrayA[i] != arrayA[i + 1]) {
                nrError++;
            }
        }
            if (nrError > 0) {

            System.out.println("Aceasta figurat nu este un patrat, reporniti programul cu date veridice.");

        }   else {

            System.out.println("Aceasta figura este un patrat.");
            aria = laturaUnu * laturaDoi;

        }

            return aria;
    }
}
