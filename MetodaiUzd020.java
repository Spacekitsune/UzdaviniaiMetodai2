package UzdaviniaiMetodai2;
//05. Exercises | Metodai negrąžinantys reikšmės
//Exercise 1 | Taromatas
//
//Taromatas tai automatas, surenkantis tarą ir grąžinantis už ją užstatą.
//Grąžinti galima metalines, stiklines ir plastikines pakuotes, pažymėtas užstato sistemos ženklu.
//Parašykite programą, kuri suskaičiuoja kiek kokios rūšies pakuočių surinko taromatas ir pateikia  grąžintiną sumą.
//Reikalavimai:
//1.	Programa priima simbolius: m (metalinė pakuotė), s (stiklinė), p (plastikinė), pagal  kuriuos suskaičiuoja kiek kokių pakuočių yra priimta.
//Jeigu įvesta neteisingai – užrašomas klaidos pranešimas. Programa baigia darbą, kai į įvedamas nulis.
//2.	Parašykite metodą printInfo(m, s, p), kuris atspausdina rezultatus, kiek kokių pakuočių buvo priimta.
//3.	Parašykite metodą printTotal(m, s, p), kuris suskaičiuoja ir atspausdina kiek pinigų grąžins taromatas už pakuotes, kai užstato dydis yra 0,10 eur.
//4.	Parašykite metodą printMax(m, s, p), kuris nustato ir atspausdina, kurios rūšies pakuočių buvo priimta daugiausiai.
//Rezultatas.
//Įveskite duomenis (m, s, p):
//m
//m
//s
//s
//p
//p
//p
//0
//Informacija:
//Metalinių: 2. Stiklinių: 2. Plastikinių: 3.
//Grąžinamas užstatas: 0 Eur 70 ct.
//Plastikinių pakuočių priimta daugiausiai.
import java.util.Scanner;
public class MetodaiUzd020 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        char input;
        int counterM = 0;
        int counterP = 0;
        int counterS = 0;

        while (true) {
            System.out.print("Iveskite taros rūšį: ");
            input = reader.next(".").charAt(0);
        if (input == '0') {
                break;
        }

        if (input == 'm') {
                counterM++;
            } else if (input == 'p') {
                counterP++;
            } else if (input == 's') {
                counterS++;
            } else {
                System.out.println("Klaida");
            }
        }

            printInfo(counterS, counterM, counterP);
            printTotal(counterS, counterM, counterP);
            printMax(counterS, counterM, counterP);

        reader.close();
    }

    private static void printInfo(int counterS, int counterM, int counterP) {
        System.out.println("Metalinių: " + counterM);
        System.out.println("Stiklinių: " + counterS);
        System.out.println("Plastikinių: " + counterP);
    }

    private static void printTotal(int counterS, int counterM, int counterP) {

        double n = (counterS + counterM + counterP) * 0.1;
        System.out.printf("Grąžinamas užstatas: %.2f Eur",n);
        System.out.println();
    }

    private static void printMax(int counterS, int counterM, int counterP) {
        int max = Math.max(counterM, (Math.max(counterS, counterP)));
        if (max == counterM) {
            System.out.println("Metalinių pakuočių priimta daugiausiai.");
        } else if (max == counterS) {
            System.out.println("Stiklinių pakuočių priimta daugiausiai.");
        } else {
            System.out.println("Plastikinių pakuočių priimta daugiausiai.");
        }
    }
}
