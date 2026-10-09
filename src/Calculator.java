
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition = " + c.add(a, b));
        System.out.println("Subtraction = " + c.subtract(a, b));
        System.out.println("Multiplication = " + c.multiply(a, b));
        System.out.println("Division = " + c.divide(a, b));
    }
}
