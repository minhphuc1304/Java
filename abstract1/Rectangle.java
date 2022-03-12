package abstract1;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public String toString() {
        return "Rectangle[" + super.toString() + ", width = " + width + ", height = " + height +"]";
    }
}
