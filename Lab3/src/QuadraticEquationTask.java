import java.util.Scanner;

public class QuadraticEquationTask {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double delta;
        double x1 = 0;
        double x2 = 0;

        while (true) {
            System.out.print("Enter coefficient a (must not be 0): ");
            a = scanner.nextDouble();
            if (a != 0) {
                break;
            }
            System.out.println("Error: 'a' cannot be zero in a quadratic equation. Please try again.");
        }

        System.out.print("Enter coefficient b: ");
        b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        c = scanner.nextDouble();

        System.out.println("\n--- Entered Coefficients ---");
        System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);

        delta = (b * b) - (4 * a * c);
        System.out.printf("Calculated Delta (Δ) = %.2f\n", delta);

        int numberOfRoots;
        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }

        switch (numberOfRoots) {
            case 2:
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Equation has two real roots:");
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
                break;

            case 1:
                x1 = -b / (2 * a);
                System.out.println("Equation has one real root:");
                System.out.printf("x1 = %.2f\n", x1);
                break;

            case 0:
                System.out.println("Equation has no real roots (Delta is negative).");
                break;

            default:
                System.out.println("Unexpected error occurred.");
                break;
        }

        System.out.println("=====================================\n");
    }
}