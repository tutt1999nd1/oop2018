package week4.task1;

public class Orange extends Fruits{
    private double price;
    public Orange(String name,String color,double price){
        super(name,color);
        this.price=price;
    }

    public Orange(double price){
        this.price=price;
    }
    public Orange(){};

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
