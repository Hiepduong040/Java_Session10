package Ex05;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Bán kính không thể < 0.");
            return;
        }
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
