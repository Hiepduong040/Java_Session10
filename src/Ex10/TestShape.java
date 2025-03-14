package Ex10;

class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Hình tròn", 5);
        shapes[1] = new Rectangle("Hình chữ nhật", 4, 6);
        shapes[2] = new Triangle("Tam giác", 3, 4, 5);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
