package week4.task1;

public class Apple extends Fruits{
    private double weight;
    public Apple(String name,String color,double weight){
        super(name,color);
        this.weight=weight;
    }
    public Apple(){}

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
