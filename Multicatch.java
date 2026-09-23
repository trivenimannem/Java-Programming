public class Multicatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            
            System.out.println(numbers[10]);
            int result = 10 / 0; 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The requested array index does not exist.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: A generic, unexpected issue occurred.");
        }
    }
}
