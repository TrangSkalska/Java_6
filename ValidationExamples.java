public class ValidationExamples {

    // 21.1 Example 1: Positive Numbers Only
    public static void setSkill(int skill) {
        if (skill <= 0) {
            throw new IllegalArgumentException("Skill must be positive.");
        }
    }

    // 21.2 Example 2: Non-Blank String
    public static void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank.");
        }
    }

    // 21.3 Example 3: Valid Index
    public static int getElement(int[] numbers, int index) {
        if (index < 0 || index >= numbers.length) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        return numbers[index];
    }

    // Test so you I can run it: 
    public static void main(String[] args) {
        setSkill(5);
        setName("Anna");
        int[] nums = {10, 20, 30};
        int value = getElement(nums, 1);
        System.out.println("value = " + value);
    }
}