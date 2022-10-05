public class Main {
    public static void main(String[] args) {
        String[] cars = {"Camaro","Corvette","Tesla"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);
//assign elements to empty array
        String[] autos = new String[3];
        autos[0] = "Camaro";
        autos[1] = "BMW";
        autos[2] = "Skoda";
        System.out.println(autos[2]);

        for (int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }


    }
}
