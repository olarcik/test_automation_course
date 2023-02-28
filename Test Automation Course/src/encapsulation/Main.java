package encapsulation;

public class Main {
    public static void main(String[] args) {

        ContBancar contFirst = new ContBancar(123456789, 5000000);
        ContBancar contSecond = new ContBancar(987654321, 10000000);


        contFirst.getNrCont();
        contFirst.getSold();

        contSecond.getNrCont();
        contSecond.getSold();

        contFirst.setSold(400000);
        contFirst.getNrCont();
        contFirst.getSold();
    }
}