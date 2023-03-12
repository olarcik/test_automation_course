package topic6;


import java.util.Scanner;

public class ContulPersoanei {

    ContulPersoanei(String numePersoana, int id, double sumaCurenta) {

        this.numePersoana = numePersoana;
        this.id = id;
        this.sumaCurenta = sumaCurenta;

    }

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public void sustragereDeBane() {

        double sumaCurenta = getSumaCurenta();
        double procentDinSumaCurenta = getSumaCurenta() * 0.1;

        System.out.println("Nu uitati! In contul de credit trebuie sa ramina nu mai putin de 10% din suma initiala! Adica " + procentDinSumaCurenta + " lei.");

        Scanner myObj = new Scanner(System.in);
        System.out.print("Introduceti suma dorita pentru extragere: ");
        double sumaSustrasa = myObj.nextDouble();


        if (sumaSustrasa == sumaCurenta) {

            throw new ArithmeticException("Nu este posibila sustragerea totala a contului de credit!!! Pe cont trebuie sa ramina 10% din suma intiala!!!");

        } else if (((sumaCurenta - sumaSustrasa) < procentDinSumaCurenta) || (sumaSustrasa > sumaCurenta)) {

            throw new ArithmeticException("Suma solicitata este prea mare!!! Pastrarea a 10% din suma solicitata pe cardul de credit este obligatorie!!!");

        } else {

            System.out.println("Banii au fost sustrasi cu succes!");
        }

    }
    }


