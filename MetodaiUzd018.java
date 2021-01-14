package UzdaviniaiMetodai2;

import java.util.Scanner;

//Exercise 7 ***
//
//Parašykite programą, kuri ištirtų natūraliųjų skaičių intervalą [a, b]:
//rastų kiek šiame intervale yra skaičių, kurių pirmo ir paskutinio skaitmenų
//suma lygi duotam natūraliajam skaičiui k (a, b – natūralieji skaičiai, didesni už 9).
//Metodas – skaičiuojantis vieno skaičiaus pirmo ir paskutinio skaitmenų sumą.
//Pasitikrinimui: jei duotas intervalas [10; 120], k=3, tuomet ieškomas kiekis lygus 5.
public class MetodaiUzd018 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įrašykite intervalo pradžią (daugiau nei 9): ");
        int a = reader.nextInt();
        System.out.print("Įrašykite intervalo pabaigą (daugiau nei 9): ");
        int b = reader.nextInt();
        System.out.print("Įrašykite natūralųjį skaičių: ");
        int k = reader.nextInt();

        int counter =0;

        while (a<=b) {
            if ( FirstLastDigitSum(a) == k) {
                counter++;
            }
            a++;
        }

        System.out.printf("Intervale yra %d skaičiai, kurių pirmo ir paskutinio skaitmenų suma yra lygi %d.", counter, k);

        reader.close();
    }
    // method to find sum of first and last digit
    private static int FirstLastDigitSum(int number) {

        // declare variables
        int lastDigit, firstDigit, divisor;;
        int totalDigits = 0;
        int sum = 0;

        // find last digit
        lastDigit = number%10;

        // find total number of digits
        totalDigits = findDigits(number);

        // calculate divisor value
        divisor = (int)Math.pow(10, totalDigits-1);

        // find first digit
        firstDigit = number / divisor;

        // add values
        sum = firstDigit + lastDigit;

        return sum;
    }

    // method to find total number of digits
    private static int findDigits(int number) {
        int count = 0;
        while(number!=0) {
            count++;
            number = number/10;
        }
        return count;
    }

}
