package Ex01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Hiep", 20);
        // getter lay thong tin
        System.out.println("Ten nguoi dung la:" + person.getName());
        System.out.println("Tuoi nguoi dung la:" + person.getAge());
        // setter thay doi thong tin
        person.setAge(19);
        person.setName("Duong Sy Hiep");
        System.out.println("Ten nguoi dung la:" + person.getName());
        System.out.println("Tuoi nguoi dung la:" + person.getAge());
    }
}
