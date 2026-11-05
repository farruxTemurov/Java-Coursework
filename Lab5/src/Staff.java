import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {
        super.initialize();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Education: ");
        this.education = scanner.nextLine();

        System.out.print("Enter Position: ");
        this.position = scanner.nextLine();
    }

    public void print1() {
        super.print();

        System.out.println("Education:  " + education);
        System.out.println("Position:   " + position);
    }
}