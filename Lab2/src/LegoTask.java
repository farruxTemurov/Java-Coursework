public class LegoTask {
    public static void runTask() {
        int numberOfBricks = 75;
        int containerCapacity = 8;
        int fullContainers;
        int totalContainers;
        int remainderBlocks;

        System.out.println("1. Total number of Lego bricks available: " + numberOfBricks);
        System.out.println("2. Capacity of a single container: " + containerCapacity);

        fullContainers = numberOfBricks / containerCapacity;
        System.out.println("3. Calculated full containers by dividing numberOfBricks by containerCapacity : " + fullContainers);

        remainderBlocks = numberOfBricks % containerCapacity;
        System.out.println("4. Calculated blocks in the non-full container (using modulo): " + remainderBlocks);

        if (remainderBlocks > 0) {
            totalContainers = fullContainers + 1;
        } else {
            totalContainers = fullContainers;
        }
        System.out.println("5. Calculated total containers (full and not full) by adding 1 in the end so the full containers and the container with a remainder add up to a total of : " + totalContainers);

        System.out.println("=====================================\n");
    }
}