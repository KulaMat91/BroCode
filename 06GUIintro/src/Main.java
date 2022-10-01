import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name"); // tworzenie okienka za pomocą tej klasy
        JOptionPane.showMessageDialog(null, "Hello " + name);

        String surname = JOptionPane.showInputDialog(name, "Enter your surname");
        JOptionPane.showMessageDialog(null, "Hello " + surname);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));// za pomocą klasy Integer tworzymy ze stringa int,
        // Klasa JOptionPane używa stringa ako wartosci
        JOptionPane.showMessageDialog(null, "You are " + age + " old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");


    }
}
