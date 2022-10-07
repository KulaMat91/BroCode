public class Main {
    public static void main(String[] args) {
//        object = an instance of a class that may contain attributes and methods

        Car myCar1 = new Car();
        Car myCar2 = new Car();


        System.out.println(myCar1.make);
        System.out.println(myCar1.color);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.color);

        myCar1.drive();
        myCar1.brake();

    }
}
