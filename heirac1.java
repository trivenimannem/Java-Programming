// Single parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1 extending Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2 extending Animal
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main execution class
public class heirca1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Both objects access the shared parent method
        myDog.eat(); 
        myCat.eat(); 

        // Objects access their specific child methods
        myDog.bark();
        myCat.meow();
        
        // Note: myCat.bark() would cause a compile-time error.
    }
}
