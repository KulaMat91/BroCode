public class Main {
    public static void main(String[] args) {
        String name = "   Mat   ";

        boolean result = name.equalsIgnoreCase("mat");
        int score = name.length();
        char at = name.charAt(3);
        int index = name.indexOf("M");
        boolean empty = name.isEmpty();
        String upper = name.toUpperCase();
        String lowe = name.toLowerCase();
        String cut = name.trim();
        String repl = name.replace('t','#');

        System.out.println(result);
        System.out.println(score);
        System.out.println(at);
        System.out.println(index);
        System.out.println(empty);
        System.out.println(upper);
        System.out.println(lowe);
        System.out.println(cut);
        System.out.println(repl);

    }
}
