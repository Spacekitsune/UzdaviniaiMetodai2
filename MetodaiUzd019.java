package UzdaviniaiMetodai2;
//Exercise 2 | Picerija
//
//Pasigamink picą. Internetinėje svetainėje galima „pasigaminti“ ir užsakyti picą.
//1 žingsnis: reikia išsirinkti picos tipą: storapadė arba plonapadė.
//2 žingsnis: pasirinkti dydį: 20cm, 30cm arba 50cm.
//3 žingsnis: išsirinkti ingredientus: sūris, kumpis, dešra, pomidorai, pievagrybiai, alyvuogės, marinuoti agurkėliai.
//Reikalavimai.
//1.	Parašykite metodą printPizzaPrice(tipas, dydis, ingredientai), kuris apskaičiuoją ir atspausdina picos kainą.
//Prie kainos nurodykite visus picos ingredientus.
//2.	Kainos:
//1.	Storapadė – 2 eur, plonapadė – 1,50 eur
//2.	20cm – 0,50 ct, 30cm – 1 eur, 50cm – 2eur
//3.	Visi ingredientai po 0,50 ct.

import java.util.Scanner;
public class MetodaiUzd019 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Pasirinkite picos tipą: storapadė ar plonapadė.");
        String picosPadas = reader.nextLine();
        System.out.print("Pasirinkite picos dydį: 20, 30 ar 50 cm.");
        int pisosDydis = Integer.parseInt(reader.nextLine());
        System.out.print("Pasirinkite ingredientų kiekį.");
        int kiekis = Integer.parseInt(reader.nextLine());
        System.out.println("Išsirinkite ingredientus: sūris, kumpis, dešra, pomidorai, pievagrybiai, alyvuogės, marinuoti agurkėliai.");
        System.out.println("Įveskite ingredientus vienoje eilutėje.");
        String top;
        String allTop = "";
        int counter=0;
        while (true) {
            top = reader.nextLine();
            allTop = allTop + top;
            counter++;
            if (counter==kiekis) {
                break;
            }
        }

        System.out.println("Užsakyta pica:");
        System.out.printf("%s , %d cm, ingredientai: %s .", picosPadas, pisosDydis, allTop);
        System.out.println();

        double bendraSuma=printPizzaPrice(picosPadas,pisosDydis,kiekis);

        System.out.printf("Kaina %.2f eur.", bendraSuma);

        reader.close();
    }
    private static double printPizzaPrice (String picosPadas, int picosDydis, int kiekis) {
        double kaina1=0;
        double kaina2=0;
        double kaina3=0;
        double suma;

        switch (picosPadas) {
            case "storapadė" :
                kaina1= 2;
                break;
            case "plonapadė" :
                kaina1= 1.5;
                break;
        }

        switch (picosDydis) {
            case 20 :
                kaina2= 0.5;
                break;
            case 30 :
                kaina2= 1;
                break;
            case 50 :
                kaina2= 2;
                break;
        }

        for (int i=1; i<= kiekis; i++) {
            kaina3=kaina3+0.5;
        }

        suma=kaina1+kaina2+kaina3;
        return suma;
    }
}
