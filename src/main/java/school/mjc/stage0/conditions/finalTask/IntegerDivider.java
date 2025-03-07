package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        // Perform integer division
        int result = dividend / divider;

        // Multiply the result by the divider
        int multipliedResult = result * divider;

        // Check if the multiplied result equals the dividend
        if (multipliedResult == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }

    }
}
