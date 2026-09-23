class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Labrador extends Dog {
    void play() {
        System.out.println("Playing...");
    }
}

public class Multi1{
    public static void main(String[] args) {
        Labrador dog = new Labrador();
        dog.breathe();
        dog.bark();
        dog.play();
    }
}
