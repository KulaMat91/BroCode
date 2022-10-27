public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

        Car(Car x){
        this.copy(x);
    }
//    Car(Car y) {
//        this.make = y.getMake();
//        this.model = y.getModel();
//        this.year = y.getYear();
////        this.setModel(y.getModel());
////        this.setMake(y.getMake());
////        this.setYear(y.getYear());
//    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

}
