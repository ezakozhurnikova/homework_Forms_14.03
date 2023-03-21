package homework;

public class Forms implements Comparable <Shape>{
    protected double getArea() {
        return 0;
    }

    protected String getName() {
        return "Shape";
    }
public int compareTo(Shape s){
        return Double.compare(getArea(),s.getArea());
    }
}
