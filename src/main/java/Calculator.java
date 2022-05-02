public class Calculator {
    public int sum(int a, int b) {
        System.out.println("Soma: " + (a + b));
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 8;

        calculator.sum(a, b);
    }
}