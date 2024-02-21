package hu.webler;

public class LoopForDRY {

    public static void main(String[] args) {

        // DRY - don't repeat yourself!!!

        System.out.println(2);  //

        int number = 2; // változóba mentve annyiszor használjuk, ahányszort szeretnénk!
        System.out.println(number);
        System.out.println(number);

        System.out.println("-----------");

        for (int i = 0; i < 10; i++) {
            System.out.println(number);
        }

        System.out.println("-----------");


        int num = 10;
        num += number;
        System.out.println(num);    // 12

        int num2 = 1;
        num2 += number;
        System.out.println(num2);   // 3

        number++;
        System.out.println(number); // 3

        num += number;
        System.out.println(num);    // 15

        num += num2;
        System.out.println(num);    // 18
    }
}
