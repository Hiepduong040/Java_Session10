package Ex07;
class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        if (name.isEmpty() || id.isEmpty() || gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("Thông tin sinh viên không hợp lệ.");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDetails() {
        return "Tên: " + name + ", Mã SV: " + id + ", GPA: " + gpa;
    }
}
