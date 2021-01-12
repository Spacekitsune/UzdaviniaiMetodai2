package UzdaviniaiMetodai2;
//Exercise 5
//
//Pradiniai duomenys – natūraliųjų skaičių seka. Sekos pabaigos požymis – nulis.
//Parašykite programą, kuri suskaičiuotų kiek sekoje yra skaičių,
//kurių kiekvieno užraše duotasis skaitmuo m pasikartoja lygiai po du kartus.
//Metodas – skaičiuojantis, kelis kartus viename skaičiuje pasikartoja duotasis skaitmuo  m.
//Pasitikrinimui: jei m=9 ir seka 2; 36; 909; 12; 45; 1099; 399; 0, tuomet ieškomas kiekis  lygus 3.


import java.util.Scanner;
public class MetodaiUzd016 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int m = 2;

        int counter = 0;

        int num;

        while (true) {
            System.out.print("Iveskite skaičių: ");

            num = reader.nextInt();
            if (num==0) {
                break;
            }

            if (m==getDigit(num)) {
                counter++;
            }
        }
        System.out.println(counter + " kartų");
        reader.close();
    }

    private static int getDigit(int a) { // randa skaičius, kurie turi  du 9.


        int counter9 = 0;

        while (a != 0)  {
            if ( a % 10 == 9) {
                counter9++;
            }
            a = a / 10;
        }
        return counter9;
    }

}
