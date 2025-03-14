package Ex02;

public class Main {
    public static void main(String[] args) {
        Animals dog = new Dog("nick");// kế thừa phương thức từ Animal - Upcasting
        dog.eat();
        Animals dog1 = (Animals) dog; // Kế thừa phưogn thức từ dog - Downcasting
        dog.eat();
    }
}
