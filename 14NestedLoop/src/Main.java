import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colums;
        String symbol = "";
        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of colums: ");
        colums = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < colums; j++) {
                System.out.print(symbol);
            }
        }
    }
}
