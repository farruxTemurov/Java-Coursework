public class CarApp {
    public static void main(String[] args) {

        Car myCar = new Car("Corolla", "Toyota", 2023, 24500.00, "Silver", 10);

        System.out.println("Initial State:");
        System.out.println(myCar.toString());
        System.out.println();

        System.out.println("Executing sale...");
        myCar.sell(2);
        System.out.println();

        System.out.println("Current Fields:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());
        System.out.println();

        myCar.setPrice(23900.50);
        myCar.setColor("Pearl White");
        System.out.println();

        System.out.println("Updated State:");
        System.out.println(myCar.toString());

        System.out.println("\n=============================================");
    }
}