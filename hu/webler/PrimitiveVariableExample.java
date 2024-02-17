package hu.webler;

public class PrimitiveVariableExample {

    public static void main(String[] args) {

        // bíte: -128 és 127 között, alapértelmezett érték: 0
        byte num1 = 0;

        // short: -32,768 és 32,767 között, alapértelmezett érték: 0
        short num2 = 0;

        // int: -2^31 és (2^31)-1 között, alaéprtelmezett érték: 0
        int num3 = 0;

        // long: -2^63 és (2^63)-1 között, alapértelmezett érték: 0
        long num4 = 0L;

        // float: kb. 1.4E-45 és kb. 3.4E+38 között, alapértelmezett érték: 0.0
        float num5 = 0.0f;

        // double: kb. 4.9E-324 és kb. 1.8+308 között, alapértelmezett érték: 0.0
        double num6 = 0.0d;


        // char: Unicode karakterek, alapértelmezett érték: '\u0000'
        char letter1 = '\u0000';
        char letter2 = 'b';

        // boolean: true vagy false, alapértelmezett érték: false
        boolean isValid = false;


        // Változók kiíratása új sorba
        System.out.println("byteVariable: " + num1);
        System.out.println("shortVariable: " + num2);
        System.out.println("intVariable: " + num3);
        System.out.println("longVariable: " + num4);
        System.out.println("floatVariable: " + num5);
        System.out.println("doubleVariable: " + num6);
        System.out.println("charVariable: " + letter1);
        System.out.println("char2: " + letter2);
        System.out.println("booleanVariable (érvényes): " + isValid);

        System.out.println("------------------");


        // a \t egy escape char, lásd extra anyagokban, felsorolva mind!
        // legjobb módszer, ha kipróbáljuk!
        System.out.println("byteVariable: \t" + num1);
        System.out.println("***************");
        System.out.println("byteVariable: \n" + num1);
        System.out.println("***************");

        //formázás
        int number = 10;
        int anotherNumber = 100;
        double value = 3.14159;
        System.out.printf("A szám: %d, az érték: %.2f \n", number, value); // String format lesz a jövőben!
        System.out.printf("A szám: %d x 10 az érték : %d \n", number, anotherNumber);
        System.out.printf("A szám: %d, az érték: %.4f", number, value);



    }
}
