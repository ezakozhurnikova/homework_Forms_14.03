package homework;

public class Circle extends Shape {
    private double radius;
    private static double PI = 3.14;

    public Circle(String displayName, double radius) {
        super(displayName);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double s = PI * (radius * radius);
        return s;
    }

}
