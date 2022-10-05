import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.printf("Hello %s", name);
        System.out.println();
        String surname;
//        scanner.nextLine();
//        To perform to always perform block of code at least once i do loop, while loop first check the conditions
        do {
            System.out.print("Enter your surname: ");
            surname = scanner.nextLine();
        } while (surname.isBlank()) ;

            System.out.printf("Hello again %s", surname);


        }
    }
