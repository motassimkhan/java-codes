class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Eagle extends Bird {
    public void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
        eagle.hunt();
    }
}