package homework;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape rectangle=new Rectangle("Rectangle",5,10);
        Shape square=new Square("Square",7);
        Shape circle=new Circle("Circle", 10);


        Shape[] shapes={circle,rectangle,square};
        System.out.println("Shapes: ");
        for (Shape s:shapes){
            System.out.println(s.getDisplayName()+" has area of "+s.getArea());
        }

        //homework 21.03
        List<Shape> forms = new ArrayList<>();
        forms.add(rectangle);
        forms.add(circle);
        forms.add(square);

        Collections.sort(forms);
        for (Shape s : forms) {
            System.out.println(s.getDisplayName()+" has area of "+s.getArea());
        }

        }
/*Square has area of 49.0
Rectangle has area of 50.0
Circle has area of 314.0
*/
    }

