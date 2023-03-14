package homework;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int getArea(){
        int s=length*width;
        return s;
    }
}
