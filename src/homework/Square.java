package homework;

public class Square extends Shape {
    double side;
    public Square(String displayName,double side){
        super(displayName);
        this.side=side;
    }
    public double getArea(){
        double s=side*side;
        return s;
    }
}
