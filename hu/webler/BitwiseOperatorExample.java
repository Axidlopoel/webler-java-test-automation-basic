package hu.webler;

public class BitwiseOperatorExample {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        // Bitwise OR operator (|) - Bitenkénti VAGY művelet
        // Itt minden operandusban azon bitek kerülnek beállításra 1-re, amelyek az operandusok közül legalább az egyikben 1-re voltak beállítva
        int resultBitwiseOR = x | y; // 5 (101) | 10 (1010) = 15 (111)
        System.out.println("Bitwise OR result: " + resultBitwiseOR); // Kiírja: 15

        // Bitwise AND operator (&) - Bitenkénti ÉS művelet
        // Itt minden operandusban azon bitek kerülnek beállításra 1-re, amelyek az összes operandusban 1-re voltak beállítva
        int resultBitwiseAND = x & y; // 5 (101) & 10 (1010) = 0 (0)
        System.out.println("Bitwise AND result: " + resultBitwiseAND); // Kiírja: 0

        // Bitwise XOR operator (^) - Bitenkénti kizáró vagy művelet
        // Ez a művelet csak akkor igaz, ha az operandusok közül pontosan az egyik igaz
        // Mindenképp számot kapunk eredményként! Magyarázat lent!
        int resultXOR = x ^ y; // 5 (101) ^ 10 (1010) = 15 (1111)
        System.out.println("Bitwise XOR result: " + resultXOR); // Kiírja: 15

        // Bitwise XAND operator (NINCS) - Bitenkénti kizáró ÉS művelet
        // Az XAND (kizáró ÉS) operátor nem létezik a Java-ban
        // Helyette használhatjuk a logikai ÉS és a logikai VAGY műveleteket a megfelelő helyeken!!!

        /*
        Magyarázat:

        1. boolean negatedXAND = (x & y) != 0;: Itt az x & y kifejezés az XAND (bitenkénti kizáró ÉS) műveletet hajtja
        végre. Az (x & y) != 0 kifejezés azt ellenőrzi, hogy az XAND művelet eredménye nem egyenlő-e nullával. Ha az
        eredmény nem nulla, akkor az XAND művelet hamis volt, és az != operátor igazat ad vissza, így a negatedXAND
        változó értéke hamis lesz. Ellenkező esetben, ha az eredmény nulla, azaz az XAND művelet igaz volt, akkor
        a != operátor hamisat ad vissza, így a negatedXAND változó értéke igaz lesz.

        2. boolean other = (x & y) == 0;: Ez a kifejezés ugyanazt az ellenőrzést végzi el, mint az előző, de itt
        közvetlenül ellenőrizzük, hogy az XAND művelet eredménye nulla-e. Ha az eredmény nulla, azaz az XAND művelet igaz
        volt, akkor az other változó értéke igaz lesz. Ellenkező esetben, ha az eredmény nem nulla, azaz az XAND művelet
        hamis volt, akkor az other változó értéke hamis lesz.

        3. boolean otherNegated = x != y;: Ez a kifejezés egyszerűen azt ellenőrzi, hogy az x és y változók értékei nem
        egyenlőek-e. Ha x és y nem egyenlő, akkor az otherNegated változó értéke igaz lesz (mivel a != operátor igazat
        ad vissza), ellenkező esetben, ha x és y egyenlőek, akkor az otherNegated változó értéke hamis lesz.
        */

        /*
        Magyarázat (int resultXOR esetére!):

        Az adott kódrészletben az x ^ y kifejezés az XOR (kizáró vagy) műveletet valósítja meg. Az XOR művelet
        bitenkénti kizáró vagy műveletet végez az x és y változók bináris reprezentációin.

        Az x és y változók értékei 5 és 10. Binárisan ezek 101 és 1010. Az XOR művelet végzi el a két szám bináris
        reprezentációjának bitenkénti kizáró vagy műveletét. Az eredményül kapott bináris szám 1111, ami decimálisan
        15-nek felel meg.

        Tehát a kód részlet az XOR művelet eredményét írja ki, ami az x és y értékeinek bitenkénti kizáró vagyát jelenti.
        A megadott komment helyesen magyarázza az XOR művelet működését és az eredményt is.
        */
    }
}
