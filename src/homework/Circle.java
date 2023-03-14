package homework;

public class Circle {
    int radius;
    double pi=3.14;
    public Circle(int radius,double pi){
        this.pi=pi;
        this.radius=radius;

    }
    public double getArea(){
        double s=pi*(radius*radius);
        return s;
        }

}
