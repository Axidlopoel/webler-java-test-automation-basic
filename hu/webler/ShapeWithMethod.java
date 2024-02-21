package hu.webler;

import java.util.Scanner;
public class ShapeWithMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a piramis méretét: ");
        int size = scanner.nextInt();
        System.out.println("Kérlek add meg a piramist alkotó szimbólumokat: ");
        String symbol = scanner.next();
        drawHalfPyramid(size, symbol);
        System.out.println("------------");
        drawFullPyramid(size, symbol);
        System.out.println("------------");
        drawRombus(size, symbol);
        System.out.println("------------");
        drawSquare(size, symbol);
        System.out.println("------------");
        System.out.println("Kérlek add meg a magasságát a téglalapnak: ");
        int height = scanner.nextInt();
        System.out.println("Kérlek add meg a szélességét a téglalapnak: ");
        int width = scanner.nextInt();
        drawRectangle(height, width, symbol);
        System.out.println("------------");
        System.out.println("Mi van, ha a paramétereket más sorrendben adom be a metódusban, de típus ugyanaz? HÁT EZ!!! ...");
        drawRectangle(width, height, symbol);
    }

    // Piramost kirajzoló metódus
    private static void drawHalfPyramid(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(symbol +" ");
            }
            System.out.println();
        }
    }

    // Teljes piramis rajzoló metódus
    private static void drawFullPyramid(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            // Először a sor előtti szóközök kiírása
            for (int j = size - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Majd a csillagok (szimbólum) kiírása a sorban
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(symbol);
            }
            /*
            for (int j = 0; j <= 2; j++) {
                System.out.print(symbol + " ");
            }
            */
            System.out.println();
        }
    }

    // Négyzet rajzoló metódus
    private static void drawSquare(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    // Téglalap rajzoló metódus
    private static void drawRectangle(int height, int width, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    // Rombusz rajzoló metódus
    private static void drawRombus(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            // Először a sor előtti szóközök kiíratása
            for (int j = size - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Majd a csillagok (szimbólum) kiírása a sorban
            for (int j = 0; j <= 2 ; j++) {
                System.out.print(symbol + ' ');
            }
            System.out.println();
        }
    }
}
