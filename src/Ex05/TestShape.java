package Ex05;

public class TestShape {
    public static void main(String[] args) {
        Circle test = new Circle(4);
        Circle test1 = (Circle) test;
        test1.getArea();
        test1.getRadius();
        test1.setRadius(5);
        test1.getArea();
        test1.getRadius();
    }
}
