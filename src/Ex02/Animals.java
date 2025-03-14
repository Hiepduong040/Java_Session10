package Ex02;
/*
* 1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?
* Kế thừa là một trong những nguyên lý cơ bản của lập trình hướng đối tượng (OOP), cho phép tạo ra các lớp mới từ các lớp đã có, giúp tái sử dụng mã nguồn và tạo ra các quan hệ giữa các đối tượng.
* 2. Sự khác biệt giữa kế thừa và bao đóng (encapsulation) trong Java là gì?
* -- Khác nhau:
*
* 3. Viết một ví dụ ngắn giải thích cách sử dụng từ khóa extends để tạo lớp con kế thừa các thuộc tính và phương thức từ lớp cha.
*
* 4. Hãy chỉ ra các lợi ích và hạn chế khi sử dụng kế thừa trong Java?
*  Lợi ích:
* + Tái sử dụng mã nguồn
* + Tổ chức mã theo hệ thống phân cấp
* + Hỗ trợ đa hình
* + Dễ mở rộng
* Hạn chế
* + Kết nối chặt chẽ --> lớp con phụ thuộc vào lớp cha
* + Không linh haotj trong 1 số trường hợp
* + Khó bảo trì khi hệ thống lớn
* + Nguy cơ ghi đè sai
* */
// 3. Ví dụ:
public class Animals {
    private String name;
    private String bark;
    public void eat(){
        System.out.println("Animals eat...");
    }

    public Animals(String name) {
        this.name = name;
    }
}
