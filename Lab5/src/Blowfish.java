import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Blowfish extends Fish implements AnimalBehavior {
    private boolean isToxic;

    public Blowfish(String name, int age, double weight, String scaleColor, boolean isToxic) {
        super(name, age, weight, scaleColor);
        this.isToxic = isToxic;
    }

    public Blowfish(String name, boolean isToxic) {
        super(name, "Yellow");
        this.isToxic = isToxic;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish is eating small crustaceans.");
    }

    @Override
    public String getVoice() {
        return "Bloop Bloop!";
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming near the coral reef.");
    }

    public void inflate() {
        System.out.println(getName() + " inflates into a spike ball!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the blowfish is resting at the sea bottom.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the Blowfish swims.");
    }
}