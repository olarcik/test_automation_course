package topic4;

public class Methods {

    static void sum(int a) {

        int suma = 0;

        int i = 0;

        if (a > 0) {

            System.out.println("Numarul introdus " + a + " este pozitiv.");

            while (i <= a) {

                suma += i;

                i++;
            }

            System.out.println("Suma numerelor de la zero pina la " + a + " este " + suma + ".");

        } else if (a < 0) {

            System.out.println("Numarul introdus " + a + " este negativ.");

            while (i >= a) {

                suma += i;

                i--;
            }
        } else {

                System.out.println("Numarul introdus este  0, nu putem calcula suma.");
            }


            System.out.println("Suma numerelor de la zero pina la " + a + " este " + suma + ".");
        }








    static int sum (int a, int b) {

        int suma = 0;

        System.out.println("Numerele introduse sun " + a + " si " + b + ".");

        if (a>b) {

            System.out.println("Numerele sunt introduse în ordinea greșita.");

            return 0;

        } else if (a==b) {

            System.out.println("Numerele sunt egale, nu calculam suma.");

            return a;

        } else {

            for (int i = a; i<=b; i++){

                suma += i;
            }
        }

        return suma;

    }
}
