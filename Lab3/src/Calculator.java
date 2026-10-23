import java.util.Scanner;
public class Calculator {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);

        float firstNumberFarrukh;
        float secondNumberFarrukh;

        System.out.print("Enter the first number: ");
        firstNumberFarrukh = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        secondNumberFarrukh = scanner.nextFloat();

        float sumFarrukh = firstNumberFarrukh + secondNumberFarrukh;
        float differenceFarrukh = firstNumberFarrukh - secondNumberFarrukh;
        float productFarrukh = firstNumberFarrukh * secondNumberFarrukh;

        System.out.printf("Sum: %.2f\n", sumFarrukh);
        System.out.printf("Difference: %.2f\n", differenceFarrukh);
        System.out.printf("Product: %.2f\n", productFarrukh);

        if (secondNumberFarrukh != 0.0f) {
            float quotientFarrukh = firstNumberFarrukh / secondNumberFarrukh;
            System.out.printf("Quotient: %.2f\n", quotientFarrukh);
        } else {
            System.out.println("Quotient: Division by zero is undefined.");
        }

        System.out.println("=====================================\n");
    }
}