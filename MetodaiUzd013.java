package UzdaviniaiMetodai2;
//Exercise 1
//
//Parašykite programą visų natūraliųjų skaičių nuo m iki n skaitmenų sumai rasti.
//Metodas – skaičiuojantis vieno skaičiaus skaitmenų sumą.
//Pasitikrinimui: jei intervalas [36; 120], tuomet ieškoma suma lygi 825

import java.util.Scanner;

public class MetodaiUzd013 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Iveskite intervalo pradžios skaičių: ");
        int startNo = reader.nextInt();

        System.out.print("Iveskite intervalo pabaigos skaičių: ");
        int endNo = reader.nextInt();

        int bendraSuma = 0;

        while (startNo <= endNo) {
            bendraSuma = bendraSuma + getSum(startNo);
            startNo++;
        }

        System.out.println("Intervalo skaitmenų suma: " + bendraSuma);

        reader.close();
    }

    private static int getSum(int a) { // apskaičiuojama skaičiaus skaitmenų suma.

        int sum = 0;

        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
