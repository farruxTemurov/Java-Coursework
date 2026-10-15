public class RandomNumberTask {
    public static void runTask() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("1. Generated random number: " + randomNumber);

        if (randomNumber % 2 == 0) {
            System.out.println("2. Checked with modulo (" + randomNumber + " % 2 == 0): The number is EVEN.");
        } else {
            System.out.println("2. Checked with modulo (" + randomNumber + " % 2 != 0): The number is ODD.");
        }

        System.out.println("=====================================\n");
    }
}