package Ex10;
class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Chiều rộng và chiều cao phải lớn hơn 0.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + ", Chiều rộng: " + width + ", Chiều cao: " + height;
    }
}

