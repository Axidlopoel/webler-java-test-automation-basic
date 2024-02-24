package hu.webler.algorithm;

public class FindElementExample {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 1, 9, 66, 2, 8};

        int foundNumber = 66;
        int notFoundNumber = 100;
        int indexFoundNumber = findNumberReturnIndex(numbers, foundNumber);
        int indexNotFoundNumber = findNumberReturnIndex(numbers, notFoundNumber);
        System.out.println("A szám indexe (megtalálta): " + indexFoundNumber);
        System.out.println("A szám indexe (nem találta): " + indexNotFoundNumber);

        int min = findMin(numbers);
    }

    private static int findNumberReturnIndex(int[] numbers, int foundNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == foundNumber) {
                return i;
            }
        }
        return -1;
    }

    private static int findMin(int[] arr) {
        int index = 0;
        int sequence = 1;

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is either null or empty.");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
                sequence = index + 1;
            }
        }
        System.out.println("Index: " + index);
        System.out.println("Sequence: " + sequence);
        return min;
    }
}
