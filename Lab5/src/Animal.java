import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {
    private String name;
    private int age;
    private double weight;



    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    public abstract void eat();
    public abstract String getVoice();
}