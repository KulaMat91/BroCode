public class Main {
    public static void main(String[] args) {

        //Encapsulation - attributes of a class will be hidden or private,
        // can accessed only through methods (getters & setters).
        // You should make attributes private if you dont have a reason to make them
        Car car = new Car("Chevrolet", "Camaro", 2021);

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
