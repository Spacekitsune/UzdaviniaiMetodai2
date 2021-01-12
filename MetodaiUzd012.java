package UzdaviniaiMetodai2;
//Exercise 1
//
//Duotas sveikųjų skaičių intervalas [m, n]. Parašykite programą, kuri suskaičiuotų kiek
//tame intervale yra skaičių, kurie dalijasi iš juos sudarančių skaitmenų sumos.
//Metodas – skaičiuojantis vieno skaičiaus skaitmenų sumą (funkcijoje naudoti ciklą while).

//Pasitikrinimui: jei intervalas [36; 120], tuomet kiekis lygus 24.

import java.util.Scanner;
public class MetodaiUzd012 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Iveskite intervalo pradžios skaičių: ");

        int startNo = reader.nextInt();

        System.out.print("Iveskite intervalo pabaigos skaičių: ");

        int endNo = reader.nextInt();

        int counter = 0;

        while (startNo <= endNo) {

            if (startNo % getSum(startNo) == 0) {

                counter++;
            }

            startNo++;
        }
        System.out.println("Intervale yra " + counter
                + " skaičiai, kurie dalijasi iš juos sudarančių skaitmenų sumos.");

        reader.close();
    }

    private static int getSum(int a) { //apskaičiuojama skaičiaus skaitmenų suma.

        int sum = 0;

        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }
}
