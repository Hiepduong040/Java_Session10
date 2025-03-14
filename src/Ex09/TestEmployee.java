package Ex09;

class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Doe", "E001", 3000);
        employees[1] = new Manager("Alice Smith", "M001", 5000, 1000);
        employees[2] = new Developer("Bob Brown", "D001", 4000, "Java");

        for (Employee e : employees) {
            System.out.println(e);
            System.out.println("Lương thực nhận: " + e.getSalary());
        }

        System.out.println("\nTăng lương cho John Doe thêm 500");
        employees[0].increaseSalary(500);
        System.out.println(employees[0]);
    }
}