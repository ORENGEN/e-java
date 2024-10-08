public class DivisionByZero {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
