package week5_6;

public class Main {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
        Shape circle1 = new Circle();
        Shape triangle1 = new Triangle();
        Shape rectangle1 = new Rectangle();
        Shape square1 = new Square();
        layer1.addShape(circle1);
        layer1.addShape(triangle1);
        layer1.addShape(rectangle1);
        diagram.addLayer(layer1);
        System.out.println(layer1.getShapes());
        layer1.removeTriangle();
        System.out.println(layer1.getShapes());
        diagram.removeCircle();
        System.out.println(layer1.getShapes());
}}
