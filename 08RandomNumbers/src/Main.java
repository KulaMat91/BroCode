import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();// random class to use random values

        int x = random.nextInt(6)+1;// miedzy 1 a 6 trzeba dodać 1 bo zaczyna od 0
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
