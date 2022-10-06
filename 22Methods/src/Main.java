public class Main {
    public static void main(String[] args) {

        int age = 21;
        hello("Mariusz", age);
        hello("Mat", 22);

        int x = 3;
        int y = 4;
        System.out.println(add(x,y));
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + "!\nYou are " + age + " years old!");
    }

    static int add(int x, int y){
        return x+y;
    }
}
