import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Brown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog is eating dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof Woof!";
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running on four paws.");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}