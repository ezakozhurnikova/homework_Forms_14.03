package homework;

public class Square {
    int side;
    public Square(int side){
        this.side=side;
    }
    public int getArea(){
        int s=side*side;
        return s;
    }
}
