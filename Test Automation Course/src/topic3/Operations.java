package topic3;

import java.text.DecimalFormat;

public class Operations {


    static void printAritmeticOperations(){

        int a = 12, b = 5;

        // valorile variabilelor
        System.out.println("a : " + a + " si b : " + b);

        // adunare
        System.out.println("a + b = " + (a + b));

        // scadere
        System.out.println("a - b = " + (a - b));

        // inmultire
        System.out.println("a * b = " + (a * b));

        // impartire
        System.out.println("a / b = " + (a / b));

        // restul impartirii
        System.out.println("a % b = " + (a % b));

    }

    static void printLogicOperations(){

        // && operatorul 'AND'
        System.out.println("(5 > 3) && (8 > 5) = " + ((5 > 3) && (8 > 5)));  // true
        System.out.println("(5 > 3) && (8 < 5) = " + ((5 > 3) && (8 < 5)));  // false

        // || operatorul 'OR'
        System.out.println("(5 < 3) || (8 > 5) = " + ((5 < 3) || (8 > 5)));  // true
        System.out.println("(5 < 3) || (8 < 5) = " + ((5 < 3) || (8 < 5)));  // false

        // ! operatorul 'NOT
        System.out.println("!(5 > 3) = " + !(5 > 3));  // false
        System.out.println("!(5 == 3) = " + !(5 == 3));  // true

    }

    static void printRelationarOperations() {


        int a = 7, b = 11;

        // valorile variabilelor
        System.out.println("a : " + a + " si b : " + b);

        // == operator - egalitate
        System.out.println("a egal cu b " + (a == b));  // false

        // != operator - diferenta
        System.out.println("a diferit de b este " + (a != b));  // true

        // > operator - mai mare
        System.out.println("a mai mare ca b este " + (a > b));  // false

        // < operator - mai mic
        System.out.println("a mai mic ca b este " + (a < b));  // true

        // >= operator - mai mare sau egal
        System.out.println("a mai mare sau egal ca b este " + (a >= b));  // false

        // <= operator - mai mic sau egal
        System.out.println("a mai mic sau egal cu b este " + (a <= b));  // true

    }

    static void useForAndWhile() {


        //verificare daca figura est eun patrat ultilizint intructiune 'FOR'
        System.out.println("1.Verificare daca figura este un patrat ultilizint intructiunea 'FOR'.");
        System.out.println("Lungimea tuturor laturilor este indicata ca fiind 4.");
        int nrError = 0;
        float[] arrayA = {4, 4, 4, 4};

        for (int i = 0; i < arrayA.length-1; i++) {

            if (arrayA[i] != arrayA[i+1]) {
                nrError++;
            }
        }
        if( nrError > 0) {
            System.out.println("Aceasta figurat nu este un patrat.");
        } else {

            System.out.println("Aceasta figura este un patrat.");

        }

        System.out.println();
        //aratam la ecran toate cifrele de la 1 la 10 utilizint instructionea 'WHILE'
        int i=1;
        System.out.println("2.Aratam la ecran toate cifrele de la 1 la 10 utilizind instructiunea 'WHILE'.");
        while(i<=10){
            System.out.println("Numarul " + i);
            i++;
        }


    }
}
