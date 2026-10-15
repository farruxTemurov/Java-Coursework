public class MarsWeightTask {
    public static void runTask() {

        float earthWeightFarrukh = 75.5f;
        float marsGravityFarrukh = 0.38f;
        double marsWeightDoubleFarrukh;
        int marsWeightIntFarrukh;
        char marsWeightCharFarrukh;
        int marsWeightMathIntFarrukh;

        float calculatedFloatWeight = earthWeightFarrukh * marsGravityFarrukh;
        System.out.println("1. Calculated initial Mars weight as float: " + calculatedFloatWeight);

        marsWeightDoubleFarrukh = calculatedFloatWeight;
        System.out.println("2. Assigned the value to a double variable." + marsWeightDoubleFarrukh );

        System.out.printf("3. Mars weight formatted to 4 decimal places: %.4f\n", marsWeightDoubleFarrukh);

        marsWeightIntFarrukh = (int) marsWeightDoubleFarrukh;
        System.out.println("4. Casted double to int type: " + marsWeightIntFarrukh);

        marsWeightCharFarrukh = (char) marsWeightIntFarrukh;
        System.out.println("5. Casted int to char type (ASCII character): " + marsWeightCharFarrukh);

        marsWeightMathIntFarrukh = marsWeightCharFarrukh + 10;
        System.out.println("6. Performed math operation (char + 10) and assigned to int: " + marsWeightMathIntFarrukh);
        System.out.println("=====================================\n");

    }
}