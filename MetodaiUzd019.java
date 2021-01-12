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

        double k1, k2, k3;
        System.out.println("Storapadė ar plonapadė pica?");
        String input1 = reader.toString();

        if (input1.equals("storapadė")) {
            k1=2;
        } else {
            k1 = 1.5;
        }

        System.out.println("Pasirinkite picos dydį: 20cm, 30 cm ar 50cm");
        String input2 = reader.toString();

        if (input2.equals("20")) {
            k2 = 0.5;
        } else if (input2.equals("30")) {
            k2 = 1;
        } else {
            k2 = 2;
        }

        System.out.println("Ingredientai:");
        System.out.println("1. Sūris.");
        System.out.println("2. Kumpis.");
        System.out.println("3. Dešra.");
        System.out.println("4. Pomidorai.");
        System.out.println("5. Pievagrybiai.");
        System.out.println("6. Alyvuogės.");
        System.out.println("7. Marinuoti agurkėliai");
        System.out.println("Kiek reikia ingredientų?");
        int n = reader.nextInt();
        k3=n*0.5;
        System.out.print("Iveskite ingredientus vienoje eilutėje");
        String ing = reader.toString();
        reader.close();
    }
    private static void string (String input1, String input2, String ing) {
        System.out.println("Užsakyta pica:");
        System.out.println(input1 + ","+ input2+ ", ingredientai: "+ing);

    }

}
