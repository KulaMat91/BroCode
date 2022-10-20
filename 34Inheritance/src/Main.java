public class Main {
    public static void main(String[] args) {
// inheritance = 	the process where one class acquires,
// 					the attributes and methods of another.
        Car car = new Car();
//        Car car = new Car(123);
        car.go();
//        Bike bike = new Bike(25);
        Bike bike = new Bike();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
