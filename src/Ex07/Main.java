package Ex07;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Nguyễn Văn A", "SV001", 3.5);
        students[1] = new GraduateStudent("Trần Thị B", "SV002", 3.8, "AI trong Y học", "TS. Lê Văn C");
        students[2] = new Student("Lê Văn D", "SV003", 2.9);

        for (Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}
