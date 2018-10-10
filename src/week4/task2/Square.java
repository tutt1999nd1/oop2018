package week4.task2;

public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side= side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }


    public String toString(){
        return getColor() + " Side: "+side+" "+"Area "+getArea();
    }
public static void main(String[] a){
        Square square= new Square();
    System.out.println(square.toString());

}
}
