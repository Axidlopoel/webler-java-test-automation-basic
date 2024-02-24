package hu.webler;

public class MethodExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        printSum(x, y);
        /*int result = x + y;
        System.out.println(result);*/

        int fixedNum = getFixedNumber();
        System.out.println("Fixált szám: " + fixedNum);

        int randomNum = getRandomNumber();
        System.out.println("Véletlen szám: " + randomNum);

        int squareX = square(x);
        int squareY = square(y);
        System.out.println(squareX);
        System.out.println(squareY);

        int square = square(100);
        System.out.println(square);
    }

    // Metódus két paraméterrel és nincs visszatérési értéke
    private static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("A számok összege: " + sum);
    }

    // Metódus paraméter nélkül, ami mindig ugyanazt a számot adja vissza
    private static int getFixedNumber() {
        return 42; // Mindig 42-t adunk vissza
    }

    // Metódus paraméter nélkül és visszatérési értékkel
    private static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    // Metódus egy paraméterrel és visszatérési értékkel
    private static int square(int num) {
        return num * num;
    }
}
