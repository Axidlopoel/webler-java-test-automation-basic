public class Main {

    // ez saját élő, létező elérési útvonal a gépemen!
    private final static String PATH = "C:\\Users";

    // de itt a lényeg nem azon volt, hogy a path élő vagy sem, hanem azon, hogy ennek a típusa szöveg, azaz String
    private final static String NON_EXISTING_PATH = "C:\\something";
    private final static String CODER = "Axidlopoel";
    private static String coder = "Csaba";

    public static void main(String[] args) {

        System.out.println("Existing path on " + CODER + " pc: " + PATH);
        System.out.println("Non existing path: " + NON_EXISTING_PATH);
        coder = "new something";

    }
}
