public class Exercise5 {

    // Precondition: b must not be zero.
    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Divisor must not be zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double result = divide(10.0, 2.0);
        System.out.println("result = " + result);
    }
}
