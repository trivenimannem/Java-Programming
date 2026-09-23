class Parent {
    String name = "Parent Field";
}

class Child extends Parent {
    String name = "Child Field";

    void printNames() {
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

public class This1{
    public static void main(String[] args) {
        new Child().printNames();
    }
}
