public class Main {
    public static void main(String[] args) {
        //polymorphis = The ability of an object to identify as more than one type.
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};
        Object[] racers2 = {car, bicycle, boat};

        for (Vehicle x : racers) {
            x.go();
        }

        System.out.println();

        for (Object x : racers2) {
            System.out.println(x.toString());
        }

        System.out.println();

        car.go();
        bicycle.go();
        boat.go();
    }
}
