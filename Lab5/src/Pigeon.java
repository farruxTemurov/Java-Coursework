import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Pigeon extends Bird {
    private String species;

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon is pecking seeds.");
    }

    @Override
    public String getVoice() {
        return "Coo Coo!";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying around the city square.");
    }

    public void deliverMessage() {
        System.out.println(getName() + " is delivering a message!");
    }
}