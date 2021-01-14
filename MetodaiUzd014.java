package UzdaviniaiMetodai2;
//Exercise 3
//
//Duotas sveikųjų skaičių intervalas [m, n]. Parašykite programą,
//kuri atspausdintų visus  šio intervalo skaičiams atvirkščius skaičius.
//Metodas – vieną skaičių perrašantis atvirkščiai.

import java.util.Scanner;
public class MetodaiUzd014 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int startNo = reader.nextInt();

        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int endNo = reader.nextInt();

        while (startNo <= endNo) {
            System.out.print(getReverse(startNo) + " ");
            startNo++;
        }

        reader.close();
    }

    private static int getReverse(int a) { // pakeičia skaičiaus skaitmenis atbuline tvarka.

        int reverseNum = 0;

        while (a != 0) {
            int digit = a % 10;
            reverseNum = reverseNum * 10 + digit;
            a /= 10;
        }

        return reverseNum;
    }
}
