public class Throw {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied: You must be at least 18.");
        }
        System.out.println("Access granted.");
    }
}
