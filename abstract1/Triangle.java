package abstract1;

public class Triangle extends Shape {
    protected double a;
    protected double b;
    protected double c;

    public Triangle() {
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea() {
        return a + b + c;
    }

    public double getPerimeter() {
        double p = getArea() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String toString() {
        return "Triangle[" + super.toString() + ", a = " + a + ", b = " + b + ", c = " + c + "]";
    }
}
