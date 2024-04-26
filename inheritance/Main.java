interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void eat() {
        System.out.println("Bird is eating.");
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane implements Flyable {
    public void takeOff() {
        System.out.println("Airplane is taking off.");
    }

    public void fly() {
        System.out.println("Airplane is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();

        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
    }
}