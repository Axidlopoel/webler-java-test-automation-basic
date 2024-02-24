package hu.webler.algorithm;

public class MaxSearch {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 6, 1, 9, 9, 4, 2, 8};
        int max = findMax(numbers);
        System.out.println("The maximum element in the array is: " + max);
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) { // csak akkor, ha a feltétel igaz!
                max = numbers[i];
            }
        }
        return max;
    }
}
