public class Main {
    public static void main(String[] args) {

        int friends = 10;
        friends++;
        friends--;
        friends = friends % 3;
        double x = (double) friends / 3;// cas int to double
        System.out.println(friends);
        System.out.println(x);
    }
}
