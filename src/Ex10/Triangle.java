package Ex10;
class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Ba cạnh không hợp lệ.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cạnh a: " + a + ", Cạnh b: " + b + ", Cạnh c: " + c;
    }
}

