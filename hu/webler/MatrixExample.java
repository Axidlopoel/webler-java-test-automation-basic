package hu.webler;

public class MatrixExample {
    public static void main(String[] args) {
        // egy dimenziós tömb feltöltése
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 100; //vagy nums[i] = i * 100;
        }


        //két dimenziós tömb (sor és oszlop a két dimenzió, pl 5 hosszú 5 mély)

        int[][] matrix = new int[5][5];

        //TODO mártix feltöltése majd kiiratása és egyéb feladatok!

        // Mátrix feltöltése for loop segítségével
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Az érték kiszámítása: az aktuális sor és oszlop össege
                matrix[i][j] = (i + 100) + (j + 100);
            }
        }

        // Mátrix kiíratása
        for (int[] numbers : matrix) {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println(); // Új sor a következő sorhoz
        }

        // TODO piramis rajzolása :)

    }

}
