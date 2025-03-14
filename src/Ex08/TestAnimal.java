package Ex08;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Kitty", 2, "Trắng");
        animals[2] = new Dog("Max", 5, "Bulldog");

        for (Animal a : animals) {
            System.out.println(a.displayInfo());
            System.out.println("Âm thanh: " + a.makeSound());
        }
    }
}
