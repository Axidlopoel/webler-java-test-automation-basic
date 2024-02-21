package hu.webler;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a piramis és négyzet méretét: ");
        int size = scanner.nextInt();


        System.out.println("Kérlek add meg a piramist/négyzetet kirajzoló szimbólumot: ");
        String symbol = scanner.next();

        System.out.println("\n-----------------\n");


        // For loop segítségével a piramis létrehozása és feltöltése
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println("\n-----------------\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        // érdekesség!!!
        System.out.println("Adj meg egy tizedest, de magyar formátumban, különben hibára fut!!!");
        double num = scanner.nextDouble(); // beadni számot: 2,3 -> terminálon magyar billentyű szerint
        System.out.println("Az általad megadott szám: " + num); // konzolon: Az általad megadott szám: 2.3
    }
}
