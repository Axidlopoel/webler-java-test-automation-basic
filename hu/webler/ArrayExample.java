package hu.webler;

public class ArrayExample {

    // Mikor jó egy tömb? - amikor előre tudom a méretét, és lehetőleg nem változik gyakran!
    /*
    Ezeknél pl. jegy eladás:
        - repülőgép ülések
        - színház ülések száma fix
        - mozi ülések száma fix
     */
    public static void main(String[] args) {

        // Tömbök jele: [] jele előtt pedig a típusa van!
        // Tömb mindig fix méretű, előre rögzíteni kell a méretét! mérete nem változtatható! ha nagyobb kell, újat csinálsz és növeled a méretét, valamint átmásolhatod ami kell
        int[] numbers = {100, 2, -3, 4};   // a hosszát úgy is meghatározhatod, hogy elemeket adsz bele egyből! ergo ez négy hosszú tömb
        int[] otherNumber = new int[10];


        System.out.println("Numbers hossza: " + numbers.length);
        System.out.println("Other numbers hossza: " + otherNumber.length);

        boolean[] isValid = {true, true, false, false, false, false, true};

        String[] names = {"Anna", "Béla", "Cecília", "Magdolna"};
        String[] text = new String[3];
        // Java programozásban az indexálás a 0-tól kezdődik
        text[0] = "Hello";
        text[1] = "Webler";
        text[2] = "kurzus!";

        System.out.println(text[0] + " " + text[1] + " "+ text[2]);

        String[] weblerCurse = new String[5];
        weblerCurse[0] = " ";
        weblerCurse[1] = "!";
        weblerCurse[2] = "Webler";
        weblerCurse[3] = "kurzus";
        weblerCurse[4] = "Hello";

        System.out.println(weblerCurse[4] + weblerCurse[0] + weblerCurse[2] + weblerCurse[0] + weblerCurse[3] + weblerCurse[1]);

        int size = weblerCurse.length;
        System.out.println("Webler kurzus tömb szavainak mérete: " + size);

        System.out.println("-------------------------");

        String[] array = new String[32];
        array[2] = "Van érték";
        array[3] = "itt is!";

        System.out.println(array[0]);
        System.out.println(array[2]);

        int[] nums = new int[10];
        nums[5] =-1;
        nums[6] = 0;
        nums[9] = 10;
        System.out.println(nums[0]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);


    }
}
