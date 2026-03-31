public class Exercise3_4 {

    // Exercise 3
    public static int calculateMonthlyCost(int employees, int salary) {
        if (employees <= 0) {
            throw new IllegalArgumentException("Employees must be greater than zero.");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must not be negative.");
        }
        return employees * salary;
    }

    // Exercise 4
    public static void main(String[] args) {
        try {
            int ok = calculateMonthlyCost(10, 3000);
            System.out.println("Monthly cost: " + ok);

            int bad = calculateMonthlyCost(0, -100);
            System.out.println("This line will not be printed: " + bad);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}