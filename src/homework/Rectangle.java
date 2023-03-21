package homework;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String displayName,double length,double width){
        super(displayName);
        this.length=length;
        this.width=width;
    }


    public double getArea(){
        double s=length*width;
        return s;
    }
}
