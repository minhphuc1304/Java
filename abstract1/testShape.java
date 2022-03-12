package abstract1;

public class testShape {
    public static void main(String[] args) {
        System.out.println("--------------------------------\n");

        Shape s1 = new Circle(3.0, "blue", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        System.out.println();

        Shape s2 = new Rectangle(4, 5);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());

        System.out.println();

        Shape s3 = new Triangle(3, 4, 5);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());

        System.out.println("\n--------------------------------\n");
    }
}
