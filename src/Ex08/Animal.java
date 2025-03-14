package Ex08;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (name.isEmpty() || age < 0) {
           System.out.println("Thông tin động vật không hợp lệ.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String displayInfo() {
        return "Tên: " + name + ", Tuổi: " + age;
    }

    public String makeSound() {
        return "Some generic sound";
    }
}
