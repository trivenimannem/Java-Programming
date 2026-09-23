class Parameterized{
    String name;
    int age;

    // Parameterized constructor
     void student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Calling the parameterized constructor
        Student student1 = new Student("Rahul", 20);
        Student student2 = new Student("Priya", 19);

        student1.display();
        System.out.println();
        student2.display();
    }
}
