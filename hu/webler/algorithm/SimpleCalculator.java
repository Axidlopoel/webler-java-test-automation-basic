package hu.webler.algorithm;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, válasszon műveletete:");
        System.out.println("1. Összeadás");
        System.out.println("2. Kivonás");
        System.out.println("3. Szorzás");
        System.out.println("4. Osztás");
        System.out.print("Választott művelet: ");

        int choice = scanner.nextInt();

        System.out.print("Kérem az első számot: ");
        double num1 = scanner.nextDouble();
        System.out.print("Kérem a második számot: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Érvénytelen választás!");
        }

        System.out.println("Eredmény: " + result);

        scanner.close(); // de ezt csak akkor, ha max újra indításkor használjátok a scannert újra, mert megnyitni / visszanyitni ... hát ...
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nullával való osztás nem lehetséges");
            return Double.NaN; // NaN (Not-a-Number) eredmény, ha a második szám nulla
        } else {
            return num1 / num2;
        }
    }
}
