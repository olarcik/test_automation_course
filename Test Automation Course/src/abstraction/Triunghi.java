package abstraction;

public class Triunghi extends FormaGeometrica {

    private float laturaUnu;
    private float laturaDoi;
    private float laturaTrei;


    public Triunghi(float laturaUnu, float laturaDoi, float laturaTrei) {

        this.laturaUnu = laturaUnu;
        this.laturaDoi = laturaDoi;
        this.laturaTrei = laturaTrei;
    }

    @Override
    public float calculArie() {

        float aria = 0;

        float perimetru = laturaUnu + laturaDoi + laturaTrei;
        aria = (float) Math.sqrt(perimetru * (perimetru - laturaUnu) * (perimetru - laturaDoi) * (perimetru - laturaTrei));

        return aria;

    }
}
