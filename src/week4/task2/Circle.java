package week4.task2;

/**
 *
 */
public class Circle extends Shape {
    final double PI = Math.PI;
    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setradius(double ras) {
        this.radius = ras;
    }

    public double getArea(){
        return radius*radius*PI;
    }

    public double getPerimeter(){
        return 2*radius*PI;
    }

    public String toString(){
        return getColor()+"Radius: " +radius +"Area:"+getArea()+"Perimeter: "+getPerimeter();
    }


}
