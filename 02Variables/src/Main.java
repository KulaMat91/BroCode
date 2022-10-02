public class Main {
    public static void main(String[] args) {
        int x = 123;
        long y = 12331231233L;
        byte z = 123;
        float a = 3.14f;
        char symbol = '@';
        int q = (int) symbol;//cast char to int
        char symbol2 = (char) q; //cast int to char
        String name = "Bro";
        System.out.println("My number is : " + x);
        System.out.println("My number is : " + y);
        System.out.println(symbol);
        System.out.println(name);
        System.out.println(q);
        System.out.println(symbol2);
    }
}
