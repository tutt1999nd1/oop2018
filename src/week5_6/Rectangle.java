package week5_6;

import java.awt.*;

/**
 * class Rectangle kế thừa 2 thuộc tính của Shape và thêm 2 thuộc tính width và length
 * @see Shape
 * @author Truong Thanh Tu
 */
public class Rectangle extends Shape {
    private Point pointcenter;
    private double width = 1.0;
    private  double  length = 1.0;

    /**
     *
     * @param color
     * @param filled
     * @param width
     * @param length
     */
    public Rectangle(String color, boolean filled, double width, double length,Point pointcenter) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.pointcenter=pointcenter;
    }

    /**
     *
     * @param color
     * @param filled
     */
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPointcenter(Point pointcenter) {
        this.pointcenter = pointcenter;
    }

    public Point getPointcenter() {
        return pointcenter;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length + width);
    }
    /**
     * in ra thông tin
     * @return  thông tin
     */
    public String toString(){
        return "rec tangle Pointcenter "+pointcenter;
    }

}

