class Student {
    int id;
    String name;

    
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Constructor with one parameter
    Student(int i) {
        id = i;
        name = "Unknown";
    }

    // Constructor with two parameters
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();              // Calls default constructor
        Student s2 = new Student(101);           // Calls one-parameter constructor
        Student s3 = new Student(903, "ruthika ");  // Calls two-parameter constructor

        s1.display();
        s2.display();
        s3.display();
    }
}