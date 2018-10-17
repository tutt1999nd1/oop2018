package week5_6;


import java.awt.*;

/**
 * class Square kế thừa 2 thuộc tính của Shape và thêm 1 thuộc tính side
 * @author Truong Thanh Tu
 */
public class Square extends Rectangle {
    private double side;
    private Point pointcenter;
    public Square(String color, boolean filled, double side, Point pointcenter) {
        super();
        this.side = side;
        this.pointcenter=pointcenter;
    }

    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side= side;
    }

    @Override
    public Point getPointcenter() {
        return pointcenter;
    }

    @Override
    public void setPointcenter(Point pointcenter) {
        this.pointcenter = pointcenter;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    /**
     * Tính điện tích của Square
     * @return diện tích
     */
    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    /**
     * in ra thông tin
     * @return thông tin
     */

    public String toString(){
        return getColor() + " Side: "+side+" "+"Area "+getArea();
    }
    public static void main(String[] a){
        Square square= new Square(3);
        System.out.println(square.toString());

    }
}

