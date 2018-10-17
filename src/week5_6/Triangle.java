package week5_6;

import java.awt.*;
import java.util.Objects;

public class Triangle extends Shape {
    private Point point1, point2, point3;

    public Triangle(String color, boolean filled, Point point1, Point point2, Point point3) {
        super(color, filled);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle() {
    }

    public void setAllPoint(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
    public String toString() {
        return "Toa do {" + "point1=" + point1 + " point2=" + point2 + " point3=" + point3 + "}";
    }
}