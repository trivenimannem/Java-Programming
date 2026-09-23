public class Finally  {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: Exception handled.");
        } finally {
            System.out.println("Inside finally block: This always runs.");
        }
    }
}
