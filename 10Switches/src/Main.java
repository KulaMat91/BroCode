public class Main {
    public static void main(String[] args) {

        String day = "Pizza";
        switch (day) {
            case "Sunday" -> System.out.println("It is Sunday!");
            case "Monday" -> System.out.println("It is Monday!");
            case "Tuesday" -> System.out.println("It is Tuesday!");
            case "Friday" -> System.out.println("It is Friday!");
            default -> System.out.println("That is not a day!");
        }
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            default:
                System.out.println("That is not a day!");
        }
    }
}
