public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Mario", 25, 95.4);
        Human human2 = new Human("Dario", 35, 77);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();

    }
}
