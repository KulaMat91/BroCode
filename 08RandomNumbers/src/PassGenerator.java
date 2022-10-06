import java.util.Random;

public class PassGenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPRSTUVQWXYZ";
        String lower = "abcdefghijklmnoprstuwvqxyz";
        String numbers = "0123456789";
        String symbol = "!@#$%^&*()_+=[]{}<>";
        Random random = new Random();
        int length = 10;
        String combination = upper + lower + numbers + symbol;
        System.out.println(combination.charAt(random.nextInt(combination.length())));
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append(combination.charAt(random.nextInt(combination.length())));
        }
        System.out.println(stringBuilder);
        stringBuilder.delete(0,length);

        for (int i = 0; i < 3; i++) {
            stringBuilder.append(upper.charAt(random.nextInt(upper.length())));
        }
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(numbers.charAt(random.nextInt(numbers.length())));
        }
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(lower.charAt(random.nextInt(lower.length())));
        }
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(symbol.charAt(random.nextInt(symbol.length())));
        }
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(lower.charAt(random.nextInt(lower.length())));
        }

        System.out.println(stringBuilder);

    }
}
