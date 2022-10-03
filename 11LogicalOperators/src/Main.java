import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(2);
        int temp = random.nextInt(50);
        System.out.println(temp);

        if (temp > 30) {
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.nextLine();
        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game ");
        }
        else {
            System.out.println("You quit the game");
        }
    }
}
