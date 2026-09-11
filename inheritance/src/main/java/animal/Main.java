package animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal newAnimal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(newAnimal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "30");

        Dog yorkie = new Dog("Yorkie", 16);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 60, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________________");
    }
}