import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String surname;
    private String firstName;
    private String street;
    private String zipCode;
    private String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter Surname: ");
        this.surname = scanner.nextLine();

        System.out.print("Enter Street: ");
        this.street = scanner.nextLine();

        System.out.print("Enter Zip Code: ");
        this.zipCode = scanner.nextLine();

        System.out.print("Enter City: ");
        this.city = scanner.nextLine();
    }

    public void print() {
        System.out.println("First Name: " + firstName);
        System.out.println("Surname:    " + surname);
        System.out.println("Address:    " + street + ", " + zipCode + " " + city);
    }
}