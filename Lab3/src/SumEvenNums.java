public class SumEvenNums {
    public static void runTask() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 0 to 100 is: " + sum);
    }
}
