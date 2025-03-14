//package Inheritance_Demo;
//
//import java.util.Scanner;
//
//public class Student extends Person{
//    // Các thuộc tính riêng
//    private String studentId;
//    private float avgGrade;
//    // Các constructor riêng;
//    public Student(){
//
//    }
//    public Student(String studentId, float avgGrade){
//        this.studentId = studentId;
//        this.avgGrade = avgGrade;
//    }
//    // Cho phép nhập toàn bộ thông tin của student
//    public void inputStudentInfo(Scanner scanner){
//        super.inputData(scanner);
//        System.out.println("Nhập mã sinh viên");
//        this.studentId = scanner.nextLine();
//        System.out.println("Nhập vào điểm trung bình:");
//        this.avgGrade = Float.parseFloat(scanner.nextFloat());
//    }
//    public void displayStudentInfo(){
//        super.displayData();
//        System.out.println("Mã SV: %s - Điểm TB: %f/n", this.studentId, this.avgGrade);
//
//    }
//
//}
