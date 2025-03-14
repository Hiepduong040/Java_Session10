package Ex03;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("BYD","Corolla",2024);
        car.getMake();
        car.getModel();
        car.getYear();
        car.setMake("Hong");
        car.setModel("Hong");
        car.setYear(2020);
        car.getMake();
        car.getModel();
        car.getYear();
    }
}
