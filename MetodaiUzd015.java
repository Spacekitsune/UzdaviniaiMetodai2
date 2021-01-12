package UzdaviniaiMetodai2;
//Exercise 4
//
//Pradiniai duomenys – natūraliųjų skaičių seka. Sekos pabaigos požymis – nulis.
//Parašykite programą, kuri suskaičiuotų kiek sekoje yra skaičių, kurių skaitmenų suma lygi
//duotajam natūraliajam skaičiui n.
//Metodas – skaičiuojantis vieno skaičiaus skaitmenų sumą.
//Pasitikrinimui: jei n=6 ir seka 20; 12; 303; 6; 24; 32; 0 tai ieškomas kiekis lygus 3.
import java.util.Scanner;
public class MetodaiUzd015 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = 6;

        int counter = 0;

        int num;

        while (true) {
            System.out.print("Iveskite skaičių: ");

            num = reader.nextInt();
            if (num==0) {
                break;
            }

            if (n==getSum(num)) {
                counter++;
            }
        }
        System.out.println(counter + " kartų");
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
