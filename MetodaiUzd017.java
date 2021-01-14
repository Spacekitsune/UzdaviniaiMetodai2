package UzdaviniaiMetodai2;

import java.util.Scanner;

//Exercise 6 ***
//
//Parašykite programą, kuri ištirtų natūraliųjų skaičių intervalą [a, b]: rastų kiek šiame
//intervale yra skaičių, turinčių lygiai po k daliklių.
//Metodas – skaičiuojanti kiek duotas skaičius turi daliklių.
//Pasitikrinimui: jei duotas intervalas [9; 19] ir k=2, tuomet ieškomas kiekis lygus 4.
public class MetodaiUzd017 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įrašykite intervalo pradžią: ");
        int a = reader.nextInt();
        System.out.print("Įrašykite intervalo pabaigą: ");
        int b = reader.nextInt();
        System.out.print("Įrašykite daliklių kiekį: ");
        int k = reader.nextInt();

        int counter =0;

        while (a<=b) {
            if (getDivisors(a) == k) {
                counter++;
            }
            a++;
        }

        System.out.printf("Intervale yra %d skaičių, kurie turi %d daliklių", counter, k);

        reader.close();
    }

    private static int getDivisors(int n) { // apskaičiuoja kiek sveikasis skaičius turi daliklių.
        int divisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                divisor++;
        }
        return divisor;
    }
}
