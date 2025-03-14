package Ex06;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        System.out.println( p1);

        MoveablePoint mp1 = new MoveablePoint(1.0, 2.0, 0.5, 0.5);
        System.out.println("Trước khi chuyển: " + mp1);
        mp1.move();
        System.out.println("Sau khi chuyển: " + mp1);
    }
}
