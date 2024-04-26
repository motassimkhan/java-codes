class Vehicle {
    public void start() {
        System.out.println("Vehicle is started.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}