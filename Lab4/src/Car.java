import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public void delivery(int amount) {
        this.quantity += amount;
        System.out.println("-> Delivery processed: Added " + amount + " cars. New stock: " + this.quantity);
    }

    public void sell(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
            System.out.println("-> Sale processed: Sold " + amount + " cars. Remaining stock: " + this.quantity);
        } else {
            System.out.println("-> Error: Not enough cars in stock to sell " + amount + "!");
        }
    }
}