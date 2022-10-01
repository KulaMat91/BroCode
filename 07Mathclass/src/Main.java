import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z);

        double a = Math.abs(y);//wartość bezwzględna
        System.out.println(a);

        double b = Math.sqrt(x);
        System.out.println(b);

        double c = Math.round(x);//zaokrągla
        double d = Math.ceil(x);//zaokrągla w góre
        double e = Math.floor(x);//zaokrągla w dół
        System.out.println("Round: " + c + "\n" + "Ceil: " + d + "\n" + "Floor: " + e);

        ////Hypotenus of the triangle
        double q;
        double w;
        double r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side q: ");
        q = scanner.nextDouble();
        System.out.println("Enter side w ");
        w = scanner.nextDouble();
        r = Math.sqrt((q * q) + (w * w));

        System.out.println("The hypotenus is : " + r);
        scanner.close();

    }
}
