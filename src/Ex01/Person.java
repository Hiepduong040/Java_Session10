package Ex01;
/*
 * 1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình hướng đối tượng?
 * Tính đóng gói (Enscapsulation) cho phép che dấu thông tin của các đối tượng và cung cấp các phương thức công khai (public API) để truy cập
 * Tính đóng gói quan trọng bởi nó ngăn chặn việc thay đổi dữ liệu một các không kiểm soát hoặc không hơpj lêj (Bảo vệ dữ liệu), thường dùn trong task vụ phân quyền
 * 2. Làm thế nào để áp dụng tính đóng gói trong Java? GIải thích cách sử dụng các phương thức getter và setter.
 * để áp dụng tính đóng gói, ta đặt các thuộc tính ở chế độ private - chỉ chỉ cho phép truy cập trong Lớp. sau đó cung cấp các phương thức công khai( public methods).
 * sau đó dùng setter để thay đổi thông tin, getter để lấy thông tin
 * 4. Bảo vệ dữ liệu, phân quyền truy cập giữa người dùng và admin,... tăng tính bảo mật và mở rộng.
 * */

// 3. Ví dụ:
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter cho name

    public String getName() {
        return name;
    }

    // setter cho name
    public void setName(String name) {
        this.name = name;
    }
    // getter cho age
    public int getAge() {
        return age;
    }
    // setter cho age
    public void setAge(int age) {
        this.age = age;
    }

}
