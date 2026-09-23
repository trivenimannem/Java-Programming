
class Vehicle {
    String type;
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called. Type: " + this.type);
    }
}


class Car extends Vehicle {
    String model;
    int speed;

    
    Car() {
     
        this("Unknown Model", 0); 
        System.out.println("Default Car constructor called.");
    }

   
    Car(String model, int speed) {
        
        super("Four-Wheeler"); 
        this.model = model;
        this.speed = speed;
        System.out.println("Parameterized Car constructor called. Model: " + this.model + ", Speed: " + this.speed);
    }

    void display() {
        System.out.println("Car Details -> Model: " + model + ", Speed: " + speed + ", Type: " + type);
    }
}
public class Constructor {
    public static void main(String[] args) {
        System.out.println("--- Creating car1 using Parameterized Constructor ---");
        Car car1 = new Car("Tesla Model S", 250);
        car1.display();

        System.out.println("\n--- Creating car2 using Default Constructor (with Chaining) ---");
        Car car2 = new Car();
        car2.display();
    }
}
