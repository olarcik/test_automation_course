package topic4;

public class Persoana {

    String numePersoana;

    int virstaPersoana;

    public Persoana(String numePersoana, int virstaPersoana) {

        this.numePersoana = numePersoana;
        this.virstaPersoana = virstaPersoana;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public int getVirstaPersoana() {
        return virstaPersoana;
    }

    public void setVirstaPersoana(int virstaPersoana) {
        this.virstaPersoana = virstaPersoana;
    }

    public void categoriePersoana(){

       String nume = getNumePersoana();

       int virsta = getVirstaPersoana();

        if (virsta <= 15) {

            System.out.println("Persoana cu numele " + nume + " face parte din categoria de virsta 'Copil'.");

        } else if(virsta > 15 && virsta <= 21 ) {

            System.out.println("Persoana cu numele " + nume + " face parte din categoria de virsta 'Adolescent'.");
        } else if(virsta > 21 && virsta <= 60) {

            System.out.println("Persoana cu numele " + nume + " face parte din categoria de virsta 'Matur'.");
        } else {

            System.out.println("Persoana cu numele " + nume + " face parte din categoria de virsta 'Virstnic'.");
        }

    }
}
