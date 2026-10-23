import java.util.Scanner;

public class BMICalculator {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);

        float weightFarrukh;
        float heightFarrukh;
        float bmiFarrukh;

        System.out.print("Enter your weight in kg (e.g., 70.5): ");
        weightFarrukh = scanner.nextFloat();

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        heightFarrukh = scanner.nextFloat();

        bmiFarrukh = (float) (weightFarrukh / Math.pow(heightFarrukh, 2));

        System.out.printf("Your BMI value: %.2f\n", bmiFarrukh);
        System.out.print("Category: ");

        if (bmiFarrukh < 16.00f) {
            System.out.println("Starvation");
        } else if (bmiFarrukh < 17.00f) {
            System.out.println("Emaciation");
        } else if (bmiFarrukh < 18.50f) {
            System.out.println("Underweight");
        } else if (bmiFarrukh < 23.00f) {
            System.out.println("Normal, low range");
        } else if (bmiFarrukh < 25.00f) {
            System.out.println("Normal, high range");
        } else if (bmiFarrukh < 27.50f) {
            System.out.println("Overweight, low range");
        } else if (bmiFarrukh < 30.00f) {
            System.out.println("Overweight, high range");
        } else if (bmiFarrukh < 35.00f) {
            System.out.println("1st degree obesity");
        } else if (bmiFarrukh < 40.00f) {
            System.out.println("2nd degree obesity");
        } else {
            System.out.println("3rd degree obesity");
        }

        System.out.println("=====================================\n");
    }
}