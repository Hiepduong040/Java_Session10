package Ex08;

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        if (breed.isEmpty()) {
            throw new IllegalArgumentException("Giống chó không được để trống.");
        }
        this.breed = breed;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Giống: " + breed;
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}