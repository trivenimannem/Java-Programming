public class Try {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("This line will be skipped.");
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        }

        System.out.println("The program continues running normally.");
    }
}
