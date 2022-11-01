import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:\\KURS JAVA\\JAVA\\BroCode\\46FileWriter\\src\\poem.txt");
            writer.write("Roses are red\nViolets are blue \nBooty booty booty \nRocking everywhere");
            writer.append("\nPoem");
            writer.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
