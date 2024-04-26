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

class Eagle extends Bird {
    public void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
        eagle.hunt();

        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
    }
}