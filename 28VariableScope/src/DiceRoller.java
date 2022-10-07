import java.util.Random;

public class DiceRoller {

    //Outside global
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

//Inside the methods local
//    DiceRoller() {
//        Random random = new Random();
//        int number = 0;
//        roll(random,number);
//    }
//
//    void roll(Random random, int number) {
//        number = random.nextInt(6) + 1;
//        System.out.println(number);
//    }
//}
