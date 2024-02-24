package hu.webler;

public class TermaryExample {

    public static void main(String[] args) {

        int dayOfWeek = 3;
        String dayName = (dayOfWeek == 3) ? "Wednesday" : "Unknown";

        System.out.println("Today is "+ dayName);

        dayName = (dayOfWeek == 1) ? "Wednesday" : "Unknown";
        System.out.println("Do we know what day is today? ... Answer: " + dayName);
    }
}
