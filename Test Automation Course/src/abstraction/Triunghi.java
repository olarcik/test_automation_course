package abstraction;

import java.text.DecimalFormat;

public class Triunghi extends FormaGeometrica {

    private float laturaUnu;
    private float laturaDoi;
    private float laturaTrei;
    private double aria = 0;

    public Triunghi(float laturaUnu, float laturaDoi, float laturaTrei) {
        this.laturaUnu = laturaUnu;
        this.laturaDoi = laturaDoi;
        this.laturaTrei = laturaTrei;
    }

    @Override
    public void calculArie() {

        float perimetru = laturaUnu + laturaDoi + laturaTrei;
        aria = Math.sqrt(perimetru * (perimetru - laturaUnu) * (perimetru - laturaDoi) * (perimetru - laturaTrei));
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("Aria triunghiului este : " + df.format(aria));

    }
}
