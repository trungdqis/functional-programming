package demo;

public class Demo {

    public static void main(String[] args) {
        int result = add(6, multiply(1, 2));
        System.out.println(result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
        return a * b;
    }

    private static void log(String format) {
        System.out.println(format);
    }
}
