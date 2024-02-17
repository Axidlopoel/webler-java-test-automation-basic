package hu.webler;

public class LoopExample {

    /*
    Az elől tesztelős és hátul tesztelős ciklusfajták az iteráció feltételének helyét határozzák meg.
    Az "elől tesztelős" ciklus azt jelenti, hogy a ciklus fejlécében ellenőrizzük a feltételt, mielőtt
    bármilyen műveletet végrehajtanánk a ciklusmagban. A "hátul tesztelős" ciklusban viszont a ciklusmag
    előre mégrehajtása után ellenőrizzük a feltételt.
     */

    // Elől tesztelős ciklusok: for, while.
    // Hátul tesztelős ciklus: do-while.
    public static void main(String[] args) {

        // For loop (ez a fori ciklus)
        // Az i változó inicializálása 0-ra, majd minden iterációban egyel növeljük.
        // A ciklus addig fut, amíg az i kisebb, mint 5.
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        // While loop
        // A ciklus addig fut, amíg a feltétel igaz (true).
        // Először ellenőrizzük a feltételt, majd hajtjuk végre a ciklusmagot.

        int i = 2;
        while(i < 5) {
            System.out.println("while loop: " + i);
            i++; // Ne felejtsük el növelni a ciklusváltozót, hogy elkerüljük a végtelen ciklust!
        }

        // Do-while loop
        // A ciklus egy blokkot hajt végre, majd ellenőrzi a feltételt.
        // Ez azt jelenti, hogy a blokk legalább egyszer lefut, még akkor is, ha a feltétel hamis az elején.
        int j = 0;
        do {
            System.out.println("DO-While loo: " + j);
            j++; // Növeljük a cilkusváltozót a végtelen ciklus elkerülése érdekében.
        } while (j < 5);

        // Enhanced for loop (foreach loop)
        // Ez a loop speciális típusú loop, ami egy iterálható objektum elemein iterál.
        // Pl. tömb vagy kollekció.
        // A ciklusmagban az aktuális elemet egy változóval kezeljük.
        // Ebben az esetben nem érdekel, hogy hányadik indexen áll, engem az érték érdekel!!!
        int[] numbers = {10, 2, 3, 4, 5};
        for (int num : numbers){
            System.out.println("Enhanced for loop: " + num);
        }

        /*
        Az "elől tesztelős" ciklusok a ciklus fejlécében ellenőrzik a feltételt, és csak akkor hajtják végre
        a ciklusmagot, ha ez a feltétel igaz. Például a for és a while ciklusok ilyen típusúak. Ebben az esetben
        a ciklusmag sosem fut le, ha a feltétel az elején hamis.

        A "hátul tesztelős" ciklusok viszont először végrehajtják a ciklusmagot, majd az iteráció végén
        ellenőrzik a feltételt. Például a do-while ciklus ilyen típusú. Ez azt jelenti, hogy
        a ciklusmag legalább egyszer lefut, még akkor is, ha a feltétel hamis a végén.

        Ez az elkülönítés az iterávció feltételéne heylére vonatkozik, és az adott ciklus típusainak
        megválasztása attól függ, hogy a cikusnak milyen viselkedése kívánt.
         */
    }
}
