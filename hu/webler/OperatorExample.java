package hu.webler;

public class OperatorExample {

    /*
    Az operátoroknak van egy prioritása vagy precedenciája, ami meghatározza, hogy melyik operátort értékelik ki először,
    ha egy kifejezésben több operátor is szerepel. Az operátorok prioritása határozza meg a kifejezés kiértékelésének sorrendjét.

    Általában az operátorokat a következő sorrendben értékelik ki:

    1. Zárójelezés
    2. Bitenkénti műveletek (pl. &, |, ^)
    3. Logikai műveletek (pl. &&, ||)
    4. Relációs és egyenlőségi operátorok (pl. <, >, ==)
    5. Aritmetikai operátorok (pl. +, -, *, /)
    6. Ternáris operátor (?:)
    7. Értékadó operátorok (pl. =, +=, -=, stb.)

    Ha több operátor van ugyanabban a kategóriában, akkor a balról jobbra történő kiértékelés van érvényben.

    Ebben az értelmezésben az XOR és az XAND operátorok ugyanazon a szinten helyezkednek el, ezért balról jobbra történő
    kiértékelés alapján kerülnek kiértékelésre.

    Fontos megjegyezni, hogy ha nem vagyunk biztosak az operátorok prioritásában, mindig használhatunk zárójeleket a
    kifejezések egyértelművé tételére. Ez segít a kód olvashatóságában és a kívánt működés biztosításában.
    */

    public static void main(String[] args) {

        int x = 5 ;
        int y = 10;
        int z = 15;

        // logical OR operator (||) . Logikai VAGY művelet
        // Ez a művelet csak akkor igaz, ha legalább az egyik operandus igaz
        boolean resultLogicalOr = (x < y) || (y < z); // true vagy true -> igaz
        System.out.println("Logical or result: " + resultLogicalOr);

        boolean res = false || true; // igaz
        System.out.println(res);

        // logical OR operator (&&) . Logikai ÉS művelet
        // Ez a művelet csak akkor igaz, ha mindkét aoperandus igaz
        boolean resultLogicalAnd = (x < y) && (y < z); // true és true -> true
        System.out.println("Logical and result: " + resultLogicalAnd);

        System.out.println(true && false);  // false
        System.out.println(false && false); // false

        // tagadás példa, jele: !
        // Az XAND művelet tagadása logikai ÉS operátorral
        boolean negateXAnd = (x & y) != 0;
        System.out.println("Negated XAND result: " + negateXAnd); // false

        boolean nonNegated = (x & y) == 0;  //true
        System.out.println("Non negated: " + nonNegated);

        boolean otherNegated = (x != y); // true
        System.out.println("Other negated: " + otherNegated);

        System.out.println(true || true || false); // true
        System.out.println(true || (true || false)); // true
        System.out.println(true && false || (true || false)); // true
        System.out.println(true && false || (true && false)); // false


        //TODO táblázat alapján feldolgozni kódban a dolgokat
    }
}
