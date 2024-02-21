package hu.webler;

public class MethodSignature {

    public static void main(String[] args) {

        // Tesztelés: egy példatömb létrehozása
        int[] numbers = {1, 2, 3, 4, 5};
        int[] nums = {-10, 100, 1000};

        int sumResult = sumElements(numbers);
        int multiplicationRes = multiplyElements(numbers);

        // Az eredmény kiíratása
        System.out.println("Az elemek összege: " + sumResult);
        System.out.println("Az elemek szorzata: " + multiplicationRes);

        int result = sumElements(nums); // elemek összeadása
        int res = multiplyElements(nums);   // elemek szorzása
        System.out.println(result);
        System.out.println(res);
    }

    /**
     * Metódus, amely összeadja a bemeneti tömb elemeit.
     *
     * @param arr a bemeneti tömb, amelynek elemeit össze akarjuk adni
     * @return az összeg, amelyet az elemekből kaptunk
     */
    public static int sumElements(int[] arr) {
        // Szignatúra:
        // - Visszatérési típus: int (az összeg)
        // - Metódusnév: sumArrayElements
        // - Paraméter: int[] arr (egész számok tömbje)

        // Paraméter:
        // - int[] arr: az input paraméter, egy egész számok tömbje

        // Body (metódusmag):
        // - Itt történik az összeadás logikája
        // - Kezdetben az összeg 0

        int sum = 0;

        // Ciklus:
        // - Egy for ciklus segítségével iterálunk végig a bemeneti tömb elemein
        // - A tömb hosszúsága (arr.length) határozza meg az iterációk számát

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        /*for (int num : arr) { // ezzel ugyanazt érjük el, de itt közvetlen az értékhez férünk hozzá! index nem érdekel
            sum += num;
        }*/
        return sum;
    }

    public static int multiplyElements(int[] arr) {
        int res = 1;
        for (int num : arr) {
            res *= num;
        }
        return res;
    }
}
