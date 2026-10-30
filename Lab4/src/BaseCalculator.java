import java.util.Scanner;

public class BaseCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose what operation you want to perform:");
            System.out.println("A. Convert from any system to decimal");
            System.out.println("B. Convert from decimal to another system");
            System.out.println("C. Sum up numbers from different systems");
            System.out.println("D. Subtract numbers from different systems");
            System.out.println("E. Multiply numbers from different systems");
            System.out.println("F. Divide numbers from different systems");
            System.out.println("W. Exit the program");
            System.out.print("=======================================\nEnter your choice (A-F or W): ");

            String input = scanner.next();
            choice = Character.toUpperCase(input.charAt(0));

            switch (choice) {
                case 'A':
                    convertToDecimal(scanner);
                    break;
                case 'B':
                    convertFromDecimal(scanner);
                    break;
                case 'C':
                    performArithmetic(scanner, '+');
                    break;
                case 'D':
                    performArithmetic(scanner, '-');
                    break;
                case 'E':
                    performArithmetic(scanner, '*');
                    break;
                case 'F':
                    performArithmetic(scanner, '/');
                    break;
                case 'W':
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between A-F or W.");
            }

        } while (choice != 'W');

        scanner.close();
    }

    private static boolean isValidBase(int base) {
        return base == 2 || base == 3 || base == 4 || base == 5 ||
                base == 6 || base == 8 || base == 9 || base == 10 || base == 16;
    }

    private static void convertToDecimal(Scanner scanner) {
        System.out.print("Enter the number (e.g., 1011, 1A, 25): ");
        String numberStr = scanner.next();

        System.out.print("Enter its source base (2, 3, 4, 5, 6, 8, 9, 10, 16): ");
        int base = scanner.nextInt();

        if (!isValidBase(base)) {
            System.out.println("Error: Unsupported base system.");
            return;
        }

        try {
            int decimalResult = Integer.parseInt(numberStr, base);
            System.out.println("Result in Decimal (Base 10): " + decimalResult);
        } catch (NumberFormatException e) {
            System.out.println("Error: The number entered is invalid for base " + base);
        }
    }

    private static void convertFromDecimal(Scanner scanner) {
        System.out.print("Enter a decimal number (Base 10): ");
        int decimalNum = scanner.nextInt();

        System.out.print("Enter target base (2, 3, 4, 5, 6, 8, 9, 10, 16): ");
        int base = scanner.nextInt();

        if (!isValidBase(base)) {
            System.out.println("Error: Unsupported base system.");
            return;
        }

        String result = Integer.toString(decimalNum, base).toUpperCase();
        System.out.println("Result in Base " + base + ": " + result);
    }

    private static void performArithmetic(Scanner scanner, char operator) {
        System.out.print("Enter first number: ");
        String num1Str = scanner.next();
        System.out.print("Enter base of first number (2,3,4,5,6,8,9,10,16): ");
        int base1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        String num2Str = scanner.next();
        System.out.print("Enter base of second number (2,3,4,5,6,8,9,10,16): ");
        int base2 = scanner.nextInt();

        System.out.print("Enter target output base for the result: ");
        int outputBase = scanner.nextInt();

        if (!isValidBase(base1) || !isValidBase(base2) || !isValidBase(outputBase)) {
            System.out.println("Error: One or more base systems are unsupported.");
            return;
        }

        try {
            int val1 = Integer.parseInt(num1Str, base1);
            int val2 = Integer.parseInt(num2Str, base2);
            int decimalResult = 0;

            switch (operator) {
                case '+':
                    decimalResult = val1 + val2;
                    break;
                case '-':
                    decimalResult = val1 - val2;
                    break;
                case '*':
                    decimalResult = val1 * val2;
                    break;
                case '/':
                    if (val2 == 0) {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    decimalResult = val1 / val2;
                    break;
            }

            String finalResult = Integer.toString(decimalResult, outputBase).toUpperCase();
            System.out.println("\nCalculation Result (" + val1 + " " + operator + " " + val2 + " in decimal):");
            System.out.println("Result in Base " + outputBase + ": " + finalResult);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format for the specified base.");
        }
    }
}
