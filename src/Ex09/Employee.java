package Ex09;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.id = "000";
        this.salary = 0.0;
    }

    public Employee(String name, String id, double salary) {
        if (name.isEmpty() || id.isEmpty() || salary < 0) {
            throw new IllegalArgumentException("Thông tin nhân viên không hợp lệ.");
        }
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Mã số: " + id + ", Lương: " + salary;
    }
}

