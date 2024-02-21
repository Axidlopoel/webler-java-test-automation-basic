package hu.webler;

public class LoopExample2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }

        System.out.println("----------");


        for (int i = 0; i < 5; i += 2) {        // i+2 nem működik! mert incrementáló operátor, nem pedig értékadó
            System.out.println(i);
        }
        System.out.println("----------");

       for (int i = 0; i < 5; i++) {
            System.out.println(i++);
        }
        System.out.println("----------");

       /*  for (int i = 0; i < 5; i++) {
            System.out.println(++i);
        }
        System.out.println("----------");*/

        for (int i = 0; i < 5; i++) {
            ++i;
            System.out.println(i);
        }
        System.out.println("----------");

        int[] numbers = {10, 20, 30, 40};   // 4 eleme van! első elem 0. index, utolsó 3. index

        for (int i = 1; i < numbers.length; i++) { //tömb végénél kisebb legyen az i
            System.out.println(i);  // az elem indexét iratjuk ki! (hányadik index maga az i)
        }
        System.out.println("----------");

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i]); // ezzel tömb értékét kérjük ki (adott indexen álló elem értékét)
        }
        System.out.println("----------");


       /* for (int i=0; i < 4; i++) { // itt 0. indextől indul a 4. indexig megy! -> ArrayIndexOutOfBoundException
            System.out.println(numbers.length[i]); // amikor i felvesuzi a 4 értékét, dob egy hibát, mert nincs  annyiadik indxen álló elem
        } // ha Exception nincs kezelve, akkor nem fut tovább a program, ergo leáll, kilép, finished with exit code 1
        System.out.println("Hiba után");
        */

        /*for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]); //ez is elszáll Exception-nel!!!
        }*/

        for (int i = 0; i <= numbers.length - 1 ; i++) {    // numbers.length = 4!!!
            System.out.println(numbers[i]);
        }
        System.out.println("----------");


        for (int i = 1; i <= numbers.length - 2; i++) { // number.length = 4 !!!
            System.out.println(numbers[i]);
        }
        System.out.println("----------");


        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // jelenleg az igény, hogy az ötödik elemtől irassunk ki!
        for (int i = 4; i < nums.length; i++) { // ez alapban int i = 0; -> ha igény van rá, csak akkor módosítsuk!!!
            System.out.println("Index: " + i + " helyen álló elem értéke: " + nums[i]);
        }
        System.out.println("----------");


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
