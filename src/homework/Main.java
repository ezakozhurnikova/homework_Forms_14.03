package homework;

public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle(4,3.14);
        double sCircle=circle.getArea();
        Rectangle rectangle=new Rectangle(4,5);
        int sRectangle= rectangle.getArea();
        Square square=new Square(6);
        int sSquare=square.getArea();
        double[] area={sSquare,sCircle,sRectangle};
        for (int i=0;i<area.length;i++){
            System.out.println("Circle has area of "+area[1]);
            System.out.println("Rectangle has area of "+area[2]);
            System.out.println("Square has area of "+area[0]);
        }




    }
}
