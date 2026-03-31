public class ExceptionsAreBetter {

    // Poor design
    public static int divideBad(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    // Better design
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor must not be zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int r1 = divideBad(10, 0);
        System.out.println("divideBad(10, 0) = " + r1);
    }
}