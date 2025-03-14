package Ex10;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Tên hình không được để trống.");
        }
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Hình: " + name + ", Diện tích: " + calculateArea() + ", Chu vi: " + calculatePerimeter();
    }
}

