public class MinMaxRandomTask {
    public static void runTask() {

        int count = 0;
        int smallest = 101;
        int largest = 0;

        System.out.println("Generating 10 random numbers between 1 and 100:");

        while (count < 10) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println(" - Generated: " + randomNumber);

            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            if (randomNumber > largest) {
                largest = randomNumber;
            }

            count++;
        }

        System.out.println("Smallest number found: " + smallest);
        System.out.println("Largest number found: " + largest);
        System.out.println("=====================================\n");
    }
}