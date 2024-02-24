package hu.webler;

public class SwitchExample {

    public static void main(String[] args) {

        int dayOfWeek = 3;
        String dayName = "";

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            default:
                dayName = "Unknown";
                break;
        }
        System.out.println("Today is " + dayName);

        /*
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
         */

        String input = "Hello";
        String output = "";

        switch (input) {
            case "hello":
                output = "hello";
                break;
            case "Hello":
                output = "Hello hello";
                break;
            default :
                input = "Not hello";
                break;
        }
        System.out.println(output);
    }
}
