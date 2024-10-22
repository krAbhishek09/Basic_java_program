public class Car extends Inheri {

    void start() {
        System.out.println("Car started");
    }

    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object of Car class
        myCar.start(); // Calls the overridden start method
    }
}
