import java.io.File;

public class Main {
    public static void main(String[] arg) {

//        File file = new File("secret_message.txt"); //tak gdy bedzie w folderze glownym projektu
        File file = new File("C:\\KURS JAVA\\JAVA\\BroCode\\45FileClass\\src\\secret_message.txt");
        File file2 = new File("README.md");
        if (file.exists()) {
            System.out.println("That file exist!");
            System.out.println(file2.getPath());
            System.out.println(file2.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();
        }
        else {
            System.out.println("That file doesn't exist!");
        }
    }
}
