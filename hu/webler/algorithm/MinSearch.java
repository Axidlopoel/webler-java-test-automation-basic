package hu.webler.algorithm;

public class MinSearch {

    public static int[] numbers = {3, 6, -1, 9, 4, -2, 8, -2000};
    public static void main(String[] args) {

        int[] numbers = {3, 6, 1, 9, 4, 2, 8};
        /*String[] words = {"Hello"};
        findMin(words);*/
        int min = findMin(numbers);
        System.out.println(min);
    }

        public static int findMin ( int[] numbers){
            // Exception handling (kicsit később részletesebben ... ez csak bevezető volt :) -> csak jelzés, hogy kezdjünk rá gondolni!)
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("The array is either null or empty.");
            }

            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            return min;
     }
}

