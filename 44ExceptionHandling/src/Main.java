import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You cant divide by 0 idiot!");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number! ");
        }
        // exception which we forget
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        //finally block god thing to add to close scanner could be open
        finally {
            scanner.close();
            System.out.println("This is always print.");
        }
    }
}
