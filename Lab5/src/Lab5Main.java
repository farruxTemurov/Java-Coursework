public class Lab5Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Buddy", 3, 15.5, "Golden", "Golden Retriever");
        animals[1] = new Pigeon("Pidgey", "Rock Dove");
        animals[2] = new Blowfish();

        animals[2].setName("Puffy");
        animals[2].setAge(1);
        animals[2].setWeight(0.8);

        System.out.println("=== ANIMAL CATALOG ===");
        for (Animal animal : animals) {
            System.out.println("\n" + animal);
            System.out.println("Voice: " + animal.getVoice());
            animal.eat();

            if (animal instanceof Dog dog) {
                dog.run();
                dog.fetch();
            } else if (animal instanceof Pigeon pigeon) {
                pigeon.fly();
                pigeon.deliverMessage();
            } else if (animal instanceof Blowfish blowfish) {
                blowfish.swim();
                blowfish.inflate();
            }
        }
    }
}