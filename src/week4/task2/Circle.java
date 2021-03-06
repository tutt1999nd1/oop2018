package week4.task2;

/**
 * class Circle kế thừa thuộc tính của Shape và thêm 1 thuộc tính radius
 * @see week4.task2.Shape
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

    /**
     * in ra thông tin
     * @return thông tin
     */
    public String toString(){
        return getColor()+" Radius: " +radius +" Area:"+getArea()+" Perimeter: "+getPerimeter();
    }

public static void main(String []a){
        Circle circle= new Circle(2);
    System.out.println(circle.toString());
}
}
